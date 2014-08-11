package at.resch.web.html.elements;

public abstract class HTMLMedia extends HTMLElement {

	private static final String EVENT_ON_ABORT = "onabort";
	private static final String EVENT_ON_CAN_PLAY = "oncanplay";
	private static final String EVENT_ON_CAN_PLAY_THROUGH = "oncanplaythrough";
	private static final String EVENT_ON_DURATION_CAHNGE = "ondurationchange";
	private static final String EVENT_ON_EMPTIED = "onemptied";
	private static final String EVENT_ON_ENDED = "onended";
	private static final String EVENT_ON_LOADED_DATA = "onloadeddata";
	private static final String EVENT_ON_LOADED_META_DATA = "onloadedmetadata";
	private static final String EVENT_ON_LOAD_START = "onloadstart";
	private static final String EVENT_ON_PAUSE = "onpause";
	private static final String EVENT_ON_PLAY = "onplay";
	private static final String EVENT_ON_PLAYING = "onplaying";
	private static final String EVENT_ON_PROGRESS = "onprogress";
	private static final String EVENT_ON_RATE_CHANGE = "onratechange";
	private static final String EVENT_ON_READY_STATE_CHANGE = "onreadystatechange";
	private static final String EVENT_ON_SEEKED = "onseeked";
	private static final String EVENT_ON_SEEKING = "onseeking";
	private static final String EVENT_ON_STALLED = "onstalled";
	private static final String EVENT_ON_SUSPEND = "onsuspend";
	private static final String EVENT_ON_TIME_UPDATE = "ontimeupdate";
	private static final String EVENT_ON_VOLUME_CHANGE = "onvolumechange";
	private static final String EVENT_ON_WAITING = "onwaiting";
	
	public HTMLMedia(String tagName, Object... children) {
		super(tagName, children);
	}

	public HTMLMedia(String tagName) {
		super(tagName);
	}
	
	public void setOnAbortHandler(String onabort) {
		set(EVENT_ON_ABORT , onabort);
	}
	
	public String getOnAbortHandler() {
		return get(EVENT_ON_ABORT);
	}
	
	public void setOnCanPlayHandler(String oncanplay) {
		set(EVENT_ON_CAN_PLAY , oncanplay);
	}
	
	public String getOnCanPlayHandler() {
		return get(EVENT_ON_CAN_PLAY);
	}
	
	public void setOnCanPlayThroughHandler(String oncanplaythrough) {
		set(EVENT_ON_CAN_PLAY_THROUGH , oncanplaythrough);
	}
	
	public String getOnCanPlayThroughHandler() {
		return get(EVENT_ON_CAN_PLAY_THROUGH);
	}
	
	public void setOnDurationCahngeHandler(String ondurationchange) {
		set(EVENT_ON_DURATION_CAHNGE , ondurationchange);
	}
	
	public String getOnDurationCahngeHandler() {
		return get(EVENT_ON_DURATION_CAHNGE);
	}
	
	public void setOnEmptiedHandler(String onemptied) {
		set(EVENT_ON_EMPTIED , onemptied);
	}
	
	public String getOnEmptiedHandler() {
		return get(EVENT_ON_EMPTIED);
	}
	
	public void setOnEndedHandler(String onended) {
		set(EVENT_ON_ENDED , onended);
	}
	
	public String getOnEndedHandler() {
		return get(EVENT_ON_ENDED);
	}
	
	public void setOnLoadedDataHandler(String onloadeddata) {
		set(EVENT_ON_LOADED_DATA , onloadeddata);
	}
	
	public String getOnLoadedDataHandler() {
		return get(EVENT_ON_LOADED_DATA);
	}
	
	public void setOnLoadedMetaDataHandler(String onloadedmetadata) {
		set(EVENT_ON_LOADED_META_DATA , onloadedmetadata);
	}
	
	public String getOnLoadedMetaDataHandler() {
		return get(EVENT_ON_LOADED_META_DATA);
	}
	
	public void setOnLoadStartHandler(String onloadstart) {
		set(EVENT_ON_LOAD_START , onloadstart);
	}
	
	public String getOnLoadStartHandler() {
		return get(EVENT_ON_LOAD_START);
	}
	
	public void setOnPauseHandler(String onpause) {
		set(EVENT_ON_PAUSE , onpause);
	}
	
	public String getOnPauseHandler() {
		return get(EVENT_ON_PAUSE);
	}
	
	public void setOnPlayHandler(String onplay) {
		set(EVENT_ON_PLAY , onplay);
	}
	
	public String getOnPlayHandler() {
		return get(EVENT_ON_PLAY);
	}
	
	public void setOnPlayingHandler(String onplaying) {
		set(EVENT_ON_PLAYING , onplaying);
	}
	
	public String getOnPlayingHandler() {
		return get(EVENT_ON_PLAYING);
	}
	
	public void setOnProgressHandler(String onprogress) {
		set(EVENT_ON_PROGRESS , onprogress);
	}
	
	public String getOnProgressHandler() {
		return get(EVENT_ON_PROGRESS);
	}
	
	public void setOnRateChangeHandler(String onratechange) {
		set(EVENT_ON_RATE_CHANGE , onratechange);
	}
	
	public String getOnRateChangeHandler() {
		return get(EVENT_ON_RATE_CHANGE);
	}
	
	public void setOnReadyStateChangeHandler(String onreadystatechange) {
		set(EVENT_ON_READY_STATE_CHANGE , onreadystatechange);
	}
	
	public String getOnReadyStateChangeHandler() {
		return get(EVENT_ON_READY_STATE_CHANGE);
	}
	
	public void setOnSeekedHandler(String onseeked) {
		set(EVENT_ON_SEEKED , onseeked);
	}
	
	public String getOnSeekedHandler() {
		return get(EVENT_ON_SEEKED);
	}
	
	public void setOnSeekingHandler(String onseeking) {
		set(EVENT_ON_SEEKING , onseeking);
	}
	
	public String getOnSeekingHandler() {
		return get(EVENT_ON_SEEKING);
	}
	
	public void setOnStalledHandler(String onstalled) {
		set(EVENT_ON_STALLED , onstalled);
	}
	
	public String getOnStalledHandler() {
		return get(EVENT_ON_STALLED);
	}
	
	public void setOnSuspendHandler(String onsuspend) {
		set(EVENT_ON_SUSPEND , onsuspend);
	}
	
	public String getOnSuspendHandler() {
		return get(EVENT_ON_SUSPEND);
	}
	
	public void setOnTimeUpdateHandler(String ontimeupdate) {
		set(EVENT_ON_TIME_UPDATE , ontimeupdate);
	}
	
	public String getOnTimeUpdateHandler() {
		return get(EVENT_ON_TIME_UPDATE);
	}
	
	public void setOnVolumeChangeHandler(String onvolumechange) {
		set(EVENT_ON_VOLUME_CHANGE , onvolumechange);
	}
	
	public String getOnVolumeChangeHandler() {
		return get(EVENT_ON_VOLUME_CHANGE);
	}
	
	public void setOnWaitingHandler(String onwaiting) {
		set(EVENT_ON_WAITING , onwaiting);
	}
	
	public String getOnWaitingHandler() {
		return get(EVENT_ON_WAITING);
	}
	


}
