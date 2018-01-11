package com.example.valokuvat;

/**
 * Represents an item in a ToDo list
 */
public class ToDoItem {

    /**
     * Tags related to a image
     */
    @com.google.gson.annotations.SerializedName("tags")
    private String mTags;
    /**
     * Unique key of the image
     */
    @com.google.gson.annotations.SerializedName("imgkey")
    private String mImgKey;
    /**
     * Login id of user
     */
    @com.google.gson.annotations.SerializedName("user_id")
    private String mUserId;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * ToDoItem constructor
     */
    public ToDoItem() {

    }

    /**
     * Initializes a new ToDoItem
     *
     * @param user_id
     *            The item text
     * @param id
     *            The item id
     * @param imgkey
     *            The key of image
     * @param tags
     *            The tags related to image
     */
    public ToDoItem(String id, String user_id, String imgkey, String tags) {
        this.setId(id);
        this.setUserId(user_id);
        this.setImgKey(imgkey);
        this.setTags(tags);
    }


    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Returns the item user_id
     */
    public String getUserId() { return mUserId;}

    /**
     * Sets the item user_id
     *
     * @param user_id
     *              user_id to set
     */
    public final void setUserId(String user_id) { mUserId = user_id;}

    /**
     * Returns the item imgkey
     */
    public String getImgKey() { return mImgKey;}

    /**
     * Sets the item user_id
     *
     * @param imgkey
     *              imgkey to set
     */
    public final void setImgKey(String imgkey) { mImgKey = imgkey;}

    /**
     * Returns the item tags
     */
    public String getTags() { return mTags;}

    /**
     * Sets the item tags
     *
     * @param tags
     *              tags to set
     */
    public final void setTags(String tags) { mTags = tags;}

    @Override
    public boolean equals(Object o) {
        return o instanceof ToDoItem && ((ToDoItem) o).mId == mId;
    }
}