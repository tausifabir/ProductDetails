
package com.example.test.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Category {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("is_inactive")
    @Expose
    private Boolean isInactive;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("category_icon")
    @Expose
    private String categoryIcon;
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("parent_slug")
    @Expose
    private String parentSlug;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getIsInactive() {
        return isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParentSlug() {
        return parentSlug;
    }

    public void setParentSlug(String parentSlug) {
        this.parentSlug = parentSlug;
    }

}
