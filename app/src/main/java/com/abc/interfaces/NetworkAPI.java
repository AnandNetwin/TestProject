package com.abc.interfaces;

//import retrofit.Callback;
//import retrofit.http.Body;
//import retrofit.http.GET;
//import retrofit.http.Multipart;
//import retrofit.http.POST;
//import retrofit.http.Part;
//import retrofit.http.Query;
//import retrofit.mime.TypedFile;
//import retrofit.mime.TypedString;

/**
 * Created by Shreyas.Kansara on 08-08-2016.
 */
public interface NetworkAPI {
//
//    @GET("/location/countries/")
//    void getCountryData(@Query("token") String token, Callback<JsonObject> response);
//
//    @GET("/location/regions/")
//    void getRegionData(@Query("countryid") int countryId, @Query("token") String token, Callback<JsonObject> response);
//
//    @GET("/location/cities/")
//    void getCityData(@Query("areaid") int regionId, @Query("token") String token, Callback<JsonObject> response);
//
//    @GET("/industry/listIndustries/")
//    void getIndustryData(@Query("token") String token, Callback<JsonObject> response);
//
//    @POST("/user/registration/")
//    void signupCompany(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/registration/")
//    void signupGolfer(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/registration/")
//    void signupTrader(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/registration/")
//    void signupCourse(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/user/uploadProfilePic/")
//    void uploadProfilePic(@Part("profile_pic") TypedFile imageFile, @Part("token") TypedString token, @Part("userid") TypedString userid, @Part("membertype") TypedString type, Callback<JsonObject> response);
//
//    @POST("/user/login/")
//    void login(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/forgotPassword/")
//    void forgotPassword(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @GET("/content/listLegends/")
//    void getLegends(@Query("token") String token, Callback<JsonObject> response);
//
//    @POST("/timeline/timelineDetailspost/")
//    void getTimeline(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/timeline/insertTimelineDetails/")
//    void postMessage(@Part("token") TypedString token, @Part("user_id") TypedString userId, @Part("timeline_message") TypedString message, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/timeline/insertTimelineImage/")
//    void postImage(@Part("token") TypedString token, @Part("user_id") TypedString userId, @Part("timeline_message") TypedString message, @Part("timeline_pic") TypedFile photo, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/timeline/insertTimelineVideo/")
//    void postVideo(@Part("token") TypedString token, @Part("user_id") TypedString userId, @Part("timeline_message") TypedString message, @Part("timeline_video") TypedFile photo, Callback<JsonObject> response);
//
//    @POST("/content/contentdata")
//    void getContent(@Body JsonObject inOnj, Callback<JsonObject> response);
//
//    @POST("/user/inviteuser")
//    void inviteFriends(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/userData/")
//    void getUserinfo(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @GET("/content/topGolfer/")
//    void getTopGolfers(@Query("token") String token, Callback<JsonObject> response);
//
//    @POST("/content/TopHundreedCourses")
//    void getTopHundredCourses(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/addProduct")
//    void addProduct(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @GET("/product/categories/")
//    void getCategoryList(@Query("token") String token, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/product/uploadItemPic")
//    void uploadProductPic(@Part("token") TypedString token, @Part("product_id") TypedString productId, @Part("product_pic") TypedFile file, Callback<JsonObject> response);
//
//    @POST("/product/search_product")
//    void searchProducts(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/list_equipment")
//    void listEquipment(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/list_travel")
//    void listTravelAgencies(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/edit_other_info")
//    void changeGolfInfo(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/list_course")
//    void listCourses(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/content/WorldCourses")
//    void getWorldCourses(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/list_product")
//    void getSellProductList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/addEquipment")
//    void addEquipment(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/addTravel")
//    void addTravelAgency(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/addCourse")
//    void addCourse(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/content/tips")
//    void getTipsList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/product/uploadSellerPhoto")
//    void uploadSellerPhoto(@Part("token") TypedString token, @Part("product_id") TypedString productId, @Part("seller_photo") TypedFile file, Callback<JsonObject> response);
//
//    @POST("/product/list_my_course")
//    void getMyCourseList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/list_my_travel")
//    void getMyTravelsList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/list_my_equipment")
//    void getMyEquipments(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/delete_equipment")
//    void deleteEquipment(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/delete_product")
//    void deleteProduct(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/delete_course")
//    void deleteCourse(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/delete_travel")
//    void deleteTravels(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/product/deleteItemPic")
//    void deleteItemPic(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/search")
//    void searchContact(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/add_friendly_golf_day")
//    void createEvent(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @Multipart
//    @POST("/event/upload_event_pic")
//    void uploadEventPic(@Part("token") TypedString token, @Part("event_id") TypedString eventId, @Part("event_pic") TypedFile file, Callback<JsonObject> response);
//
//    @POST("/event/list_event_updated")
//    void listEvents(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/content/get_golf_category")
//    void getGolfCategory(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/content/get_golf_subcategory")
//    void getGolfSubCategory(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/content/search_golf_rules")
//    void searchGolfRules(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/accept_event_invitation")
//    void acceptEventInvitation(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/deny_event_invitation")
//    void denyEventInvitation(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/send_friend_request")
//    void sendFriendRequest(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/accept_friend_request")
//    void acceptFriendRequest(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/deny_friend_request")
//    void denyFriendRequest(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/received_request")
//    void receivedRequest(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/friend_list")
//    void getContactList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/remove_friend")
//    void removeFriendRequest(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/inbox")
//    void getInboxListing(@Body JsonObject inObj, Callback<JsonObject> response);
//
//
//    @POST("/messaging/delete_message")
//    void deleteMessage(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/message_detail")
//    void readDetailMessage(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/search_user")
//    void getFriendList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/send_message")
//    void sendMessage(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/event_joining_member_list")
//    void getAttendeeList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/notification/list_notification")
//    void getNotificationList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/notification/delete_notification")
//    void deleteNotification(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/fallback")
//    void fallbackWS(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/received_request")
//    void getReceivedList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/sent_request")
//    void getSentList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/logout")
//    void logout(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/set_privacy")
//    void changePrivacySettings(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/user/change_password")
//    void changePassword(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/players_list")
//    void getPlayerList(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/invite_players")
//    void inviteFriend(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/event/my_events")
//    void getMyEvents(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/inbox_updated")
//    void getInboxListingUpdated(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/message_list")
//    void getDetailChat(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/messaging/delete_conversation")
//    void deleteConversation(@Body JsonObject inObj, Callback<JsonObject> response);
//
//    @POST("/contact/contact_us")
//    void contactUs(@Body JsonObject inObj, Callback<JsonObject> response);
}
