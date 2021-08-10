package layout


/* TODO                     0_0
        If you want to get all the fields - Uncomment them
        and replace <Posts> with <AllPosts>
*/

//import com.google.gson.annotations.SerializedName
//
//data class AllPosts(
//    @SerializedName("data")
//    val `data`: Data,
//    @SerializedName("kind")
//    val kind: String
//) {
//    data class Data(
//        @SerializedName("after")
//        var after: String,
//        @SerializedName("before")
//        var before: Any,
//        @SerializedName("children")
//        var children: List<Children>,
//        @SerializedName("dist")
//        var dist: Int,
//        @SerializedName("geo_filter")
//        var geoFilter: Any,
//        @SerializedName("modhash")
//        var modhash: String
//    ) {
//        data class Children(
//            @SerializedName("data")
//            var `data`: Data,
//            @SerializedName("kind")
//            var kind: String
//        ) {
//            data class Data(
//                @SerializedName("all_awardings")
//                var allAwardings: List<AllAwarding>,
//                @SerializedName("allow_live_comments")
//                var allowLiveComments: Boolean,
//                @SerializedName("approved_at_utc")
//                var approvedAtUtc: Any,
//                @SerializedName("approved_by")
//                var approvedBy: Any,
//                @SerializedName("archived")
//                var archived: Boolean,
//                @SerializedName("author")
//                var author: String,
//                @SerializedName("author_cakeday")
//                var authorCakeday: Boolean,
//                @SerializedName("author_flair_background_color")
//                var authorFlairBackgroundColor: String,
//                @SerializedName("author_flair_css_class")
//                var authorFlairCssClass: Any,
//                @SerializedName("author_flair_richtext")
//                var authorFlairRichtext: List<AuthorFlairRichtext>,
//                @SerializedName("author_flair_template_id")
//                var authorFlairTemplateId: String,
//                @SerializedName("author_flair_text")
//                var authorFlairText: String,
//                @SerializedName("author_flair_text_color")
//                var authorFlairTextColor: String,
//                @SerializedName("author_flair_type")
//                var authorFlairType: String,
//                @SerializedName("author_fullname")
//                var authorFullname: String,
//                @SerializedName("author_is_blocked")
//                var authorIsBlocked: Boolean,
//                @SerializedName("author_patreon_flair")
//                var authorPatreonFlair: Boolean,
//                @SerializedName("author_premium")
//                var authorPremium: Boolean,
//                @SerializedName("awarders")
//                var awarders: List<Any>,
//                @SerializedName("banned_at_utc")
//                var bannedAtUtc: Any,
//                @SerializedName("banned_by")
//                var bannedBy: Any,
//                @SerializedName("can_gild")
//                var canGild: Boolean,
//                @SerializedName("can_mod_post")
//                var canModPost: Boolean,
//                @SerializedName("category")
//                var category: Any,
//                @SerializedName("clicked")
//                var clicked: Boolean,
//                @SerializedName("content_categories")
//                var contentCategories: Any,
//                @SerializedName("contest_mode")
//                var contestMode: Boolean,
//                @SerializedName("created")
//                var created: Int,
//                @SerializedName("created_utc")
//                var createdUtc: Int,
//                @SerializedName("discussion_type")
//                var discussionType: Any,
//                @SerializedName("distinguished")
//                var distinguished: Any,
//                @SerializedName("domain")
//                var domain: String,
//                @SerializedName("downs")
//                var downs: Int,
//                @SerializedName("edited")
//                var edited: Boolean,
//                @SerializedName("gilded")
//                var gilded: Int,
//                @SerializedName("gildings")
//                var gildings: Gildings,
//                @SerializedName("hidden")
//                var hidden: Boolean,
//                @SerializedName("hide_score")
//                var hideScore: Boolean,
//                @SerializedName("id")
//                var id: String,
//                @SerializedName("is_created_from_ads_ui")
//                var isCreatedFromAdsUi: Boolean,
//                @SerializedName("is_crosspostable")
//                var isCrosspostable: Boolean,
//                @SerializedName("is_meta")
//                var isMeta: Boolean,
//                @SerializedName("is_original_content")
//                var isOriginalContent: Boolean,
//                @SerializedName("is_reddit_media_domain")
//                var isRedditMediaDomain: Boolean,
//                @SerializedName("is_robot_indexable")
//                var isRobotIndexable: Boolean,
//                @SerializedName("is_self")
//                var isSelf: Boolean,
//                @SerializedName("is_video")
//                var isVideo: Boolean,
//                @SerializedName("likes")
//                var likes: Any,
//                @SerializedName("link_flair_background_color")
//                var linkFlairBackgroundColor: String,
//                @SerializedName("link_flair_css_class")
//                var linkFlairCssClass: String,
//                @SerializedName("link_flair_richtext")
//                var linkFlairRichtext: List<LinkFlairRichtext>,
//                @SerializedName("link_flair_template_id")
//                var linkFlairTemplateId: String,
//                @SerializedName("link_flair_text")
//                var linkFlairText: String,
//                @SerializedName("link_flair_text_color")
//                var linkFlairTextColor: String,
//                @SerializedName("link_flair_type")
//                var linkFlairType: String,
//                @SerializedName("locked")
//                var locked: Boolean,
//                @SerializedName("media")
//                var media: Any,
//                @SerializedName("media_embed")
//                var mediaEmbed: MediaEmbed,
//                @SerializedName("media_only")
//                var mediaOnly: Boolean,
//                @SerializedName("mod_note")
//                var modNote: Any,
//                @SerializedName("mod_reason_by")
//                var modReasonBy: Any,
//                @SerializedName("mod_reason_title")
//                var modReasonTitle: Any,
//                @SerializedName("mod_reports")
//                var modReports: List<Any>,
//                @SerializedName("name")
//                var name: String,
//                @SerializedName("no_follow")
//                var noFollow: Boolean,
//                @SerializedName("num_comments")
//                var numComments: Int,
//                @SerializedName("num_crossposts")
//                var numCrossposts: Int,
//                @SerializedName("num_reports")
//                var numReports: Any,
//                @SerializedName("over_18")
//                var over18: Boolean,
//                @SerializedName("parent_whitelist_status")
//                var parentWhitelistStatus: String,
//                @SerializedName("permalink")
//                var permalink: String,
//                @SerializedName("pinned")
//                var pinned: Boolean,
//                @SerializedName("post_hint")
//                var postHint: String,
//                @SerializedName("preview")
//                var preview: Preview,
//                @SerializedName("pwls")
//                var pwls: Int,
//                @SerializedName("quarantine")
//                var quarantine: Boolean,
//                @SerializedName("removal_reason")
//                var removalReason: Any,
//                @SerializedName("removed_by")
//                var removedBy: Any,
//                @SerializedName("removed_by_category")
//                var removedByCategory: Any,
//                @SerializedName("report_reasons")
//                var reportReasons: Any,
//                @SerializedName("saved")
//                var saved: Boolean,
//                @SerializedName("score")
//                var score: Int,
//                @SerializedName("secure_media")
//                var secureMedia: Any,
//                @SerializedName("secure_media_embed")
//                var secureMediaEmbed: SecureMediaEmbed,
//                @SerializedName("selftext")
//                var selftext: String,
//                @SerializedName("selftext_html")
//                var selftextHtml: Any,
//                @SerializedName("send_replies")
//                var sendReplies: Boolean,
//                @SerializedName("spoiler")
//                var spoiler: Boolean,
//                @SerializedName("stickied")
//                var stickied: Boolean,
//                @SerializedName("subreddit")
//                var subreddit: String,
//                @SerializedName("subreddit_id")
//                var subredditId: String,
//                @SerializedName("subreddit_name_prefixed")
//                var subredditNamePrefixed: String,
//                @SerializedName("subreddit_subscribers")
//                var subredditSubscribers: Int,
//                @SerializedName("subreddit_type")
//                var subredditType: String,
//                @SerializedName("suggested_sort")
//                var suggestedSort: String,
//                @SerializedName("thumbnail")
//                val thumbnail: String,
//                @SerializedName("thumbnail_height")
//                var thumbnailHeight: Int,
//                @SerializedName("thumbnail_width")
//                var thumbnailWidth: Int,
//                @SerializedName("title")
//                var title: String,
//                @SerializedName("top_awarded_type")
//                var topAwardedType: Any,
//                @SerializedName("total_awards_received")
//                var totalAwardsReceived: Int,
//                @SerializedName("treatment_tags")
//                var treatmentTags: List<Any>,
//                @SerializedName("ups")
//                var ups: Int,
//                @SerializedName("upvote_ratio")
//                var upvoteRatio: Double,
//                @SerializedName("url")
//                var url: String,
//                @SerializedName("url_overridden_by_dest")
//                var urlOverriddenByDest: String,
//                @SerializedName("user_reports")
//                var userReports: List<Any>,
//                @SerializedName("view_count")
//                var viewCount: Any,
//                @SerializedName("visited")
//                var visited: Boolean,
//                @SerializedName("whitelist_status")
//                var whitelistStatus: String,
//                @SerializedName("wls")
//                var wls: Int
//            ) {
//                data class AllAwarding(
//                    @SerializedName("award_sub_type")
//                    var awardSubType: String,
//                    @SerializedName("award_type")
//                    var awardType: String,
//                    @SerializedName("awardings_required_to_grant_benefits")
//                    var awardingsRequiredToGrantBenefits: Any,
//                    @SerializedName("coin_price")
//                    var coinPrice: Int,
//                    @SerializedName("coin_reward")
//                    var coinReward: Int,
//                    @SerializedName("count")
//                    var count: Int,
//                    @SerializedName("days_of_drip_extension")
//                    var daysOfDripExtension: Int,
//                    @SerializedName("days_of_premium")
//                    var daysOfPremium: Int,
//                    @SerializedName("description")
//                    var description: String,
//                    @SerializedName("end_date")
//                    var endDate: Any,
//                    @SerializedName("giver_coin_reward")
//                    var giverCoinReward: Any,
//                    @SerializedName("icon_format")
//                    var iconFormat: Any,
//                    @SerializedName("icon_height")
//                    var iconHeight: Int,
//                    @SerializedName("icon_url")
//                    var iconUrl: String,
//                    @SerializedName("icon_width")
//                    var iconWidth: Int,
//                    @SerializedName("id")
//                    var id: String,
//                    @SerializedName("is_enabled")
//                    var isEnabled: Boolean,
//                    @SerializedName("is_new")
//                    var isNew: Boolean,
//                    @SerializedName("name")
//                    var name: String,
//                    @SerializedName("penny_donate")
//                    var pennyDonate: Any,
//                    @SerializedName("penny_price")
//                    var pennyPrice: Any,
//                    @SerializedName("resized_icons")
//                    var resizedIcons: List<ResizedIcon>,
//                    @SerializedName("resized_static_icons")
//                    var resizedStaticIcons: List<ResizedStaticIcon>,
//                    @SerializedName("start_date")
//                    var startDate: Any,
//                    @SerializedName("static_icon_height")
//                    var staticIconHeight: Int,
//                    @SerializedName("static_icon_url")
//                    var staticIconUrl: String,
//                    @SerializedName("static_icon_width")
//                    var staticIconWidth: Int,
//                    @SerializedName("subreddit_coin_reward")
//                    var subredditCoinReward: Int,
//                    @SerializedName("subreddit_id")
//                    var subredditId: Any,
//                    @SerializedName("tiers_by_required_awardings")
//                    var tiersByRequiredAwardings: Any
//                ) {
//                    data class ResizedIcon(
//                        @SerializedName("height")
//                        var height: Int,
//                        @SerializedName("url")
//                        var url: String,
//                        @SerializedName("width")
//                        var width: Int
//                    )
//
//                    data class ResizedStaticIcon(
//                        @SerializedName("height")
//                        var height: Int,
//                        @SerializedName("url")
//                        var url: String,
//                        @SerializedName("width")
//                        var width: Int
//                    )
//                }
//
//                data class AuthorFlairRichtext(
//                    @SerializedName("a")
//                    var a: String,
//                    @SerializedName("e")
//                    var e: String,
//                    @SerializedName("t")
//                    var t: String,
//                    @SerializedName("u")
//                    var u: String
//                )
//
//                data class Gildings(
//                    @SerializedName("gid_1")
//                    var gid1: Int,
//                    @SerializedName("gid_2")
//                    var gid2: Int
//                )
//
//                data class LinkFlairRichtext(
//                    @SerializedName("a")
//                    var a: String,
//                    @SerializedName("e")
//                    var e: String,
//                    @SerializedName("t")
//                    var t: String,
//                    @SerializedName("u")
//                    var u: String
//                )
//
//                class MediaEmbed
//
//                data class Preview(
//                    @SerializedName("enabled")
//                    var enabled: Boolean,
//                    @SerializedName("images")
//                    var images: List<Image>,
//                    @SerializedName("reddit_video_preview")
//                    var redditVideoPreview: RedditVideoPreview
//                ) {
//                    data class Image(
//                        @SerializedName("id")
//                        var id: String,
//                        @SerializedName("resolutions")
//                        var resolutions: List<Resolution>,
//                        @SerializedName("source")
//                        var source: Source,
//                        @SerializedName("variants")
//                        var variants: Variants
//                    ) {
//                        data class Resolution(
//                            @SerializedName("height")
//                            var height: Int,
//                            @SerializedName("url")
//                            var url: String,
//                            @SerializedName("width")
//                            var width: Int
//                        )
//
//                        data class Source(
//                            @SerializedName("height")
//                            var height: Int,
//                            @SerializedName("url")
//                            var url: String,
//                            @SerializedName("width")
//                            var width: Int
//                        )
//
//                        data class Variants(
//                            @SerializedName("gif")
//                            var gif: Gif,
//                            @SerializedName("mp4")
//                            var mp4: Mp4,
//                            @SerializedName("nsfw")
//                            var nsfw: Nsfw,
//                            @SerializedName("obfuscated")
//                            var obfuscated: Obfuscated
//                        ) {
//                            data class Gif(
//                                @SerializedName("resolutions")
//                                var resolutions: List<Resolution>,
//                                @SerializedName("source")
//                                var source: Source
//                            ) {
//                                data class Resolution(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//
//                                data class Source(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//                            }
//
//                            data class Mp4(
//                                @SerializedName("resolutions")
//                                var resolutions: List<Resolution>,
//                                @SerializedName("source")
//                                var source: Source
//                            ) {
//                                data class Resolution(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//
//                                data class Source(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//                            }
//
//                            data class Nsfw(
//                                @SerializedName("resolutions")
//                                var resolutions: List<Resolution>,
//                                @SerializedName("source")
//                                var source: Source
//                            ) {
//                                data class Resolution(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//
//                                data class Source(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//                            }
//
//                            data class Obfuscated(
//                                @SerializedName("resolutions")
//                                var resolutions: List<Resolution>,
//                                @SerializedName("source")
//                                var source: Source
//                            ) {
//                                data class Resolution(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//
//                                data class Source(
//                                    @SerializedName("height")
//                                    var height: Int,
//                                    @SerializedName("url")
//                                    var url: String,
//                                    @SerializedName("width")
//                                    var width: Int
//                                )
//                            }
//                        }
//                    }
//
//                    data class RedditVideoPreview(
//                        @SerializedName("bitrate_kbps")
//                        var bitrateKbps: Int,
//                        @SerializedName("dash_url")
//                        var dashUrl: String,
//                        @SerializedName("duration")
//                        var duration: Int,
//                        @SerializedName("fallback_url")
//                        var fallbackUrl: String,
//                        @SerializedName("height")
//                        var height: Int,
//                        @SerializedName("hls_url")
//                        var hlsUrl: String,
//                        @SerializedName("is_gif")
//                        var isGif: Boolean,
//                        @SerializedName("scrubber_media_url")
//                        var scrubberMediaUrl: String,
//                        @SerializedName("transcoding_status")
//                        var transcodingStatus: String,
//                        @SerializedName("width")
//                        var width: Int
//                    )
//                }
//
//                class SecureMediaEmbed
//            }
//        }
//    }
//}