package com.example.androidgame.serviceimpl

import com.example.androidgame.dto.MCommentList
import com.example.androidgame.dto.MDiscussList
import com.example.androidgame.dto.MDiscussNewList
import com.example.androidgame.entity.*
import com.example.androidgame.mapper.*
import com.example.androidgame.service.MDiscussService
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MDiscussServiceImpl : MDiscussService{

    @Autowired(required = false)
    lateinit var discussMapper:DiscussMapper
    @Autowired(required = false)
    lateinit var userdiscussMapper: UserdiscussMapper
    @Autowired(required = false)
    lateinit var gameMapper: GameMapper
    @Autowired(required = false)
    lateinit var userallMapper: UserallMapper
    @Autowired(required = false)
    lateinit var commentMapper:CommentMapper

    override fun GetList(): String {
        var discussList:MutableList<Discuss> = discussMapper.selectAll()
        var mDiscussList = ArrayList<MDiscussList>()
        for (i in discussList){
            var mDiscuss = MDiscussList()
            var example1: UserdiscussExample = UserdiscussExample()
            var criteria:UserdiscussExample.Criteria = example1.createCriteria()
            criteria.andDiscussIdEqualTo(i.discussId)
            var userdiscussList:MutableList<Userdiscuss> = userdiscussMapper.selectByExample(example1)
            var game:Game = gameMapper.selectByPrimaryKey(userdiscussList[0].gameId)
            var user:Userall = userallMapper.selectByPrimaryKey(userdiscussList[0].userId)
            mDiscuss.discussId = i.discussId
            mDiscuss.discussDetail = i.discussDetail
            mDiscuss.discussTitle = i.discussTitle
            mDiscuss.userName = user.userName
            mDiscuss.userImage = user.userImage
            mDiscuss.gameName = game.gameName
            mDiscussList.add(mDiscuss)
        }
        return Gson().toJson(mDiscussList)
    }

    override fun GetDiscussList(gameName:String): String {
        var mDiscussNewLists:MutableList<MDiscussNewList> = ArrayList()
        var discussList:MutableList<Discuss> = discussMapper.selectByGameName(gameName)
        for (i in discussList){
            var mDiscussNewList:MDiscussNewList = MDiscussNewList()
            mDiscussNewList.userImage = userallMapper.selectUserByDiscuss(i.discussId).userImage
            mDiscussNewList.userName = userallMapper.selectUserByDiscuss(i.discussId).userName
            mDiscussNewList.discussId = i.discussId
            mDiscussNewList.discussTitle = i.discussTitle
            mDiscussNewList.discussDetail = i.discussDetail
            mDiscussNewLists.add(mDiscussNewList)
        }
        return Gson().toJson(mDiscussNewLists)
    }

    override fun GetQAList(game: String): String {
        var mDiscussNewLists:MutableList<MDiscussNewList> = ArrayList()
        var discussList:MutableList<Discuss> = discussMapper.selectQAByGameName(game)
        for (i in discussList){
            var mDiscussNewList:MDiscussNewList = MDiscussNewList()
            mDiscussNewList.userImage = userallMapper.selectUserByDiscuss(i.discussId).userImage
            mDiscussNewList.userName = userallMapper.selectUserByDiscuss(i.discussId).userName
            mDiscussNewList.discussId = i.discussId
            mDiscussNewList.discussTitle = i.discussTitle
            mDiscussNewList.discussDetail = i.discussDetail
            mDiscussNewLists.add(mDiscussNewList)
        }
        return Gson().toJson(mDiscussNewLists)
    }

    override fun GetCommentList(discussId: Int): String {
        var mCommentLists:MutableList<MCommentList> = ArrayList()
        var example:CommentExample = CommentExample()
        var criteria:CommentExample.Criteria = example.createCriteria()
        criteria.andDiscussIdEqualTo(discussId)
        var commentList:MutableList<Comment> = commentMapper.selectByExample(example)
        for (i in commentList){
            var mCommentList:MCommentList = MCommentList()
            mCommentList.userImage = userallMapper.selectByPrimaryKey(i.userId).userImage
            mCommentList.userName = userallMapper.selectByPrimaryKey(i.userId).userName
            mCommentList.commentDetail = i.commentDetail
            if(i?.replytoId != 0){
                mCommentList.replytoName = userallMapper.selectByPrimaryKey(i.replytoId).userName
                if(i?.rcommentId !=0){
                    mCommentList.rcomment = mCommentList.replytoName + ":"+commentMapper.selectByPrimaryKey(i.rcommentId).commentDetail
                }
            }
            mCommentList.discussId = i.discussId
            mCommentList.commentId = i.commentId
            mCommentLists.add(mCommentList)
        }
        return  Gson().toJson(mCommentLists)

    }

    override fun Reply(commentDetail: String, userName: String, replyName: String,discussId: Int,rcommentId:Int) {
        var comment:Comment = Comment()
        var example1:UserallExample = UserallExample()
        var criteria1:UserallExample.Criteria = example1.createCriteria()
        criteria1.andUserNameEqualTo(userName)
        var userall:MutableList<Userall> = userallMapper.selectByExample(example1)
        comment.userId = userall[0].userId
        if("" != replyName){
            var example2:UserallExample = UserallExample()
            var criteria2:UserallExample.Criteria = example2.createCriteria()
            criteria2.andUserNameEqualTo(replyName)
            var userall2:MutableList<Userall> = userallMapper.selectByExample(example2)
            comment.replytoId = userall2[0].userId
            comment.commentDetail = commentDetail
            comment.rcommentId = rcommentId
        }else{
            comment.commentDetail = commentDetail
        }
        comment.discussId = discussId
        commentMapper.insertSelective(comment)

    }
}