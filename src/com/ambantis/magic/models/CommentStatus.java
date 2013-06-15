package com.ambantis.magic.models;

/**
 * The status of this comment. Status can be changed by posting a
 * reply to a comment with the desired status.
 *     - "open" - The comment is still open.
 *     - "resolved" - The comment has been resolved by one of its replies.
 * COMMENTS.status : string
 *
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 12:26 PM
 */
public enum CommentStatus {
    OPEN, RESOLVED
}
