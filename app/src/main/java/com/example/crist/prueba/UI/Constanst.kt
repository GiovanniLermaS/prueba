package com.example.crist.prueba.UI

class Constants {

    interface Connection {
        companion object {
            val API_BASEURL = "http://admin.uinrun.com"
        }
    }
            enum class RepositoriesTag(val url: String) {
        API_BASEURL("/api/users/updatePhoto"),
        UPLOAD_PHOTO("/api/users/updatePhoto"),
        CONFIRM_CODE("/api/users/verifyCode"),
        LOGIN_NORMAL("/api/logIn"),
        REGISTER("/api/singUp"),
        RESET_PASSWORD("/api/users/resetPassword"),
        GET_SONG("/api/users/listSongs"),
        LOGIN_NETWORK("/api/logInSocialNetwork"),
        SAVE_TRACK("/api/users/saveHistory"),
        GET_HISTORY("/api/users/listHistory"),
        GET_LAST_HISTORY("/api/users/last_track"),
        REGISTER_USER_INFO("/api/users/put"),
        UPDATE_USER_INFO("/api/users/updateUser"),
        CHANGE_DISTANCE("/api/users/changeDistance"),
        CHANGE_LANGUAGE("/api/users/changeLanguage"),
        CHANGE_USER_KIND("/api/users/UpdateKindUser"),
        NEW_PASSWORD("/api/users/newPassword"),
        UPDATE_TOKEN("/api/users/updateTokenFirebase"),
        RE_SEND_CODE("/api/users/newcode"),
        FILTERS_SIMPLE("/api/covers/listingFilter"),
        GET_EVENT_BY_CODE("/api/events/filterEventAppU1N"),
        COVERS_SIMPLES_PREMIUM("/api/covers/listingApp"),
        COVERS_SIMPLES_FREE("/api/config/data"),
        CONSULT_COVERS_PLANES("/api/covers/listingAppDesc"),
        GET_PLANS("/api/plans/getPlans"),
        GET_DAY("/api/plans/getDay"),
        FINISH_PLAN("/api/plans/FinishPlans"),
        DELETE_PLAN("/api/plans/DeletePlans"),
        SAVE_PLAN_HISTORY("/api/plans/saveHistory"),
        START_PLAN("/api/plans/startPlan"),
        REGISTER_NETWORK("/api/singUpSocialNetwork"),
        VALIDATE_CODE_REFERRAL("/api/users/verifyCompanyCodeApp")
    }

    enum class HttpTypeMethod {
        post, get, put, delete
    }
}