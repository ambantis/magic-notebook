package com.ambantis.magic.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:32 AM
 */
public class Comment {

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

    /**
     * The status of this comment.
     * COMMENTS.status : string
     */
    private CommentStatus mStatus;

    /**
     * The file which this comment is addressing.
     * COMMENTS.fileID : string
     */
    private String mFileID;


    /**
     * The title of the file which this comment is addressing.
     * COMMENTS.fileTitle : string
     */
    private String mFileTitle;

    /**
     * Replies to this post.
     * COMMENTS.replies : list[]
     * Not sure we want to use this or how? it is a nested list of other comments,
     * or perhaps another object?
     */
    private ArrayList<Comment> replies;


}
