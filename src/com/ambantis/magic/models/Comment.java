package com.ambantis.magic.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:32 AM
 */
public class Comment implements Jsonable {

    private final static Comment nullComment =
            new Comment(null,null,null, null,null,null);

    public static Comment getNullComment() {
        return nullComment;
    }

    /**
     * A link back to this comment.
     * COMMENTS.selfLink : string
     */
    private String mSelfLink;

    /**
     * The ID of the comment.
     * COMMENTS.commentId : string
     */
    private String mCommentId;

    /**
     * The date when this comment was first created.
     * COMMENTS.createDate : datetime
     */
    private Date mCreateDate;

    /**
     * The user who wrote this comment.
     * COMMENTS.author : nested object (comment.author.displayName)
     */
    private Student mAuthor;

    /**
     * The plain text content used to create this comment.
     * COMMENTS.content : string
     */
    private String mContent;

//    /**
//     * The status of this comment.
//     * COMMENTS.status : string
//     */
//    private CommentStatus mStatus;

    /**
     * The file which this comment is addressing.
     * COMMENTS.fileID : string
     */
    private String mFileID;

//    /**
//     * The title of the file which this comment is addressing.
//     * COMMENTS.fileTitle : string
//     */
//    private String mFileTitle;
//
//    /**
//     * Replies to this post.
//     * COMMENTS.replies : list[]
//     * Not sure we want to use this or how? it is a nested list of other comments,
//     * or perhaps another object?
//     *  todo:2013-06-15:ambantis:determine if
//     */
//    private ArrayList<Comment> mReplies;

    public Comment(String mSelfLink, String mCommentId, Date mCreateDate, Student mAuthor,
                   String mContent, /*CommentStatus mStatus,*/ String mFileID) {
//                    , String mFileTitle, ArrayList<Comment> mReplies) {
        this.mSelfLink = mSelfLink;
        this.mCommentId = mCommentId;
        this.mCreateDate = mCreateDate;
        this.mAuthor = mAuthor;
        this.mContent = mContent;
//      this.mStatus = mStatus;
        this.mFileID = mFileID;
//      this.mFileTitle = mFileTitle;
//        this.mReplies = mReplies;
    }

    public String getmSelfLink() {
        return mSelfLink;
    }

    public void setmSelfLink(String mSelfLink) {
        this.mSelfLink = mSelfLink;
    }

    public String getmCommentId() {
        return mCommentId;
    }

    public void setmCommentId(String mCommentId) {
        this.mCommentId = mCommentId;
    }

    public Date getmCreateDate() {
        return mCreateDate;
    }

    public void setmCreateDate(Date mCreateDate) {
        this.mCreateDate = mCreateDate;
    }

    public Student getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(Student mAuthor) {
        this.mAuthor = mAuthor;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

//    public CommentStatus getmStatus() {
//        return mStatus;
//    }
//
//    public void setmStatus(CommentStatus mStatus) {
//        this.mStatus = mStatus;
//    }

    public String getmFileID() {
        return mFileID;
    }

    public void setmFileID(String mFileID) {
        this.mFileID = mFileID;
    }

//    public String getmFileTitle() {
//        return mFileTitle;
//    }
//
//    public void setmFileTitle(String mFileTitle) {
//        this.mFileTitle = mFileTitle;
//    }
//
//    public ArrayList<Comment> getmReplies() {
//        return mReplies;
//    }
//
//    public void setmReplies(ArrayList<Comment> mReplies) {
//        this.mReplies = mReplies;
//    }
//


    @Override
    public String toString() {
        return mContent;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
