package pages.ids;

public enum BasePageIds {
	
	IN_SEARCH_BOX_ID("ct-single-search"),
	BTN_SEARCH_BUTTON_CLASS("search-icon md-search"),
	TXT_NAV_TITLE_ID("nav-location-text"),
	BTN_NOTIFICATION_ID("ct-notifications-wrapper"),
	BTN_AVATAR_ID("avatar-dropdown"),
	TXT_AVATAR_NAME_ID("avatar-dropdown"),
	BTN_LOGOUT_ID("logout"),
	BTN_BOS_LANG_XPATH(".//*[@value='ba']"),
	BTN_ENG_LANG_XPATH(".//*[@value='en']"),
	LINK_MY_PROFILE_XPATH(".//*[@ng-click='linkToMyProfile()']"),
	BTN_RESET_PWD_ID("reset-own-password"),
	BTN_USER_WEB_ID("user-manual-web"),
	BTN_USER_MOB_ID("user-manual-mobile"),
	BTN_NAV_MENU_CLASS("md-menu"),
	BTN_OVERVIEW_ID("overview-li"),
	BTN_CONTACTS_ID("contact-li"),
	BTN_DEALS_ID("deal-li"),
	BTN_CASES_ID("project-li"),
	BTN_TASKS_ID("task-li"),
	BTN_TEAMS_ID("team-li"),
	BTN_SETTINGS_ID("settings-li"),
	BTN_ABOUT_ID("about-li");
	
	
	
	private final String id;

	private BasePageIds(String id) {
		this.id = id;
	}
	
	public String getId(){
		return id;
	}

}
