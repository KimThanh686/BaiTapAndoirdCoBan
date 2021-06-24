package com.example.getapi.model

data class UserModel(
    val avatar_url: String? = "", // https://avatars.githubusercontent.com/u/6941388?v=4
    val bio: String? = "", // - Senior Android (Kotlin and Java). - Cross platform: Flutter (Dart) and React Native (Javascript).
    val blog: String? = "",
    val company: String? = "", // Netacom
    val created_at: String? = "", // 2014-03-13T13:32:45Z
    val email: Any? = Any(), // null
    val events_url: String? = "", // https://api.github.com/users/ToanMobile/events{/privacy}
    val followers: Int? = 0, // 40
    val followers_url: String? = "", // https://api.github.com/users/ToanMobile/followers
    val following: Int? = 0, // 34
    val following_url: String? = "", // https://api.github.com/users/ToanMobile/following{/other_user}
    val gists_url: String? = "", // https://api.github.com/users/ToanMobile/gists{/gist_id}
    val gravatar_id: String? = "",
    val hireable: Any? = Any(), // null
    val html_url: String? = "", // https://github.com/ToanMobile
    val id: Int? = 0, // 6941388
    val location: String? = "", // HCM, Viet Nam.
    val login: String? = "", // ToanMobile
    val name: String? = "", // Huỳnh Văn Toàn
    val node_id: String? = "", // MDQ6VXNlcjY5NDEzODg=
    val organizations_url: String? = "", // https://api.github.com/users/ToanMobile/orgs
    val public_gists: Int? = 0, // 5
    val public_repos: Int? = 0, // 53
    val received_events_url: String? = "", // https://api.github.com/users/ToanMobile/received_events
    val repos_url: String? = "", // https://api.github.com/users/ToanMobile/repos
    val site_admin: Boolean? = false, // false
    val starred_url: String? = "", // https://api.github.com/users/ToanMobile/starred{/owner}{/repo}
    val subscriptions_url: String? = "", // https://api.github.com/users/ToanMobile/subscriptions
    val twitter_username: Any? = Any(), // null
    val type: String? = "", // User
    val updated_at: String? = "", // 2021-06-23T02:35:55Z
    val url: String? = "" // https://api.github.com/users/ToanMobile
)