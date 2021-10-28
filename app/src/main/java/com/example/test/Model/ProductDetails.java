
package com.example.test.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProductDetails {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("maximum_order")
    @Expose
    private Integer maximumOrder;
    @SerializedName("category_list")
    @Expose
    private List<Category> categoryList = null;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("buisness_name")
    @Expose
    private String buisnessName;
    @SerializedName("seller_id")
    @Expose
    private Integer sellerId;
    @SerializedName("seller_slug")
    @Expose
    private String sellerSlug;
    @SerializedName("will_show_emi")
    @Expose
    private Boolean willShowEmi;
    @SerializedName("brand")
    @Expose
    private Brand brand;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("pre_order")
    @Expose
    private Boolean preOrder;
    @SerializedName("booking_price")
    @Expose
    private Integer bookingPrice;
    @SerializedName("product_price")
    @Expose
    private Integer productPrice;
    @SerializedName("discount_charge")
    @Expose
    private Object discountCharge;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("details_images")
    @Expose
    private List<String> detailsImages = null;
    @SerializedName("is_event")
    @Expose
    private Boolean isEvent;
    @SerializedName("event_id")
    @Expose
    private Object eventId;
    @SerializedName("highlight")
    @Expose
    private Boolean highlight;
    @SerializedName("highlight_id")
    @Expose
    private Object highlightId;
    @SerializedName("groupping")
    @Expose
    private Boolean groupping;
    @SerializedName("groupping_id")
    @Expose
    private Object grouppingId;
    @SerializedName("campaign_section_id")
    @Expose
    private Object campaignSectionId;
    @SerializedName("campaign_section")
    @Expose
    private Boolean campaignSection;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("seo")
    @Expose
    private Boolean seo;
    @SerializedName("meta_keyword")
    @Expose
    private String metaKeyword;
    @SerializedName("meta_description")
    @Expose
    private String metaDescription;
    @SerializedName("variation")
    @Expose
    private Object variation;
    @SerializedName("banner_image")
    @Expose
    private String bannerImage;
    @SerializedName("banner_image_link")
    @Expose
    private String bannerImageLink;
    @SerializedName("attribute_value")
    @Expose
    private Object attributeValue;
    @SerializedName("icon_specification")
    @Expose
    private Object iconSpecification;
    @SerializedName("product_review_avg")
    @Expose
    private Integer productReviewAvg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaximumOrder() {
        return maximumOrder;
    }

    public void setMaximumOrder(Integer maximumOrder) {
        this.maximumOrder = maximumOrder;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBuisnessName() {
        return buisnessName;
    }

    public void setBuisnessName(String buisnessName) {
        this.buisnessName = buisnessName;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerSlug() {
        return sellerSlug;
    }

    public void setSellerSlug(String sellerSlug) {
        this.sellerSlug = sellerSlug;
    }

    public Boolean getWillShowEmi() {
        return willShowEmi;
    }

    public void setWillShowEmi(Boolean willShowEmi) {
        this.willShowEmi = willShowEmi;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(Boolean preOrder) {
        this.preOrder = preOrder;
    }

    public Integer getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(Integer bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Object getDiscountCharge() {
        return discountCharge;
    }

    public void setDiscountCharge(Object discountCharge) {
        this.discountCharge = discountCharge;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getDetailsImages() {
        return detailsImages;
    }

    public void setDetailsImages(List<String> detailsImages) {
        this.detailsImages = detailsImages;
    }

    public Boolean getIsEvent() {
        return isEvent;
    }

    public void setIsEvent(Boolean isEvent) {
        this.isEvent = isEvent;
    }

    public Object getEventId() {
        return eventId;
    }

    public void setEventId(Object eventId) {
        this.eventId = eventId;
    }

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public Object getHighlightId() {
        return highlightId;
    }

    public void setHighlightId(Object highlightId) {
        this.highlightId = highlightId;
    }

    public Boolean getGroupping() {
        return groupping;
    }

    public void setGroupping(Boolean groupping) {
        this.groupping = groupping;
    }

    public Object getGrouppingId() {
        return grouppingId;
    }

    public void setGrouppingId(Object grouppingId) {
        this.grouppingId = grouppingId;
    }

    public Object getCampaignSectionId() {
        return campaignSectionId;
    }

    public void setCampaignSectionId(Object campaignSectionId) {
        this.campaignSectionId = campaignSectionId;
    }

    public Boolean getCampaignSection() {
        return campaignSection;
    }

    public void setCampaignSection(Boolean campaignSection) {
        this.campaignSection = campaignSection;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Boolean getSeo() {
        return seo;
    }

    public void setSeo(Boolean seo) {
        this.seo = seo;
    }

    public String getMetaKeyword() {
        return metaKeyword;
    }

    public void setMetaKeyword(String metaKeyword) {
        this.metaKeyword = metaKeyword;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Object getVariation() {
        return variation;
    }

    public void setVariation(Object variation) {
        this.variation = variation;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getBannerImageLink() {
        return bannerImageLink;
    }

    public void setBannerImageLink(String bannerImageLink) {
        this.bannerImageLink = bannerImageLink;
    }

    public Object getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(Object attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Object getIconSpecification() {
        return iconSpecification;
    }

    public void setIconSpecification(Object iconSpecification) {
        this.iconSpecification = iconSpecification;
    }

    public Integer getProductReviewAvg() {
        return productReviewAvg;
    }

    public void setProductReviewAvg(Integer productReviewAvg) {
        this.productReviewAvg = productReviewAvg;
    }

}
