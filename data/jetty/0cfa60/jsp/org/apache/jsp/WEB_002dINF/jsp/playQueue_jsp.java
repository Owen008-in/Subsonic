package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class playQueue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/jsp/head.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/include.jsp");
    _jspx_dependants.add("/WEB-INF/sub.tld");
    _jspx_dependants.add("/WEB-INF/jsp/jquery.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/playQueueCast.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_theme_code_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_theme_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_spring_theme_code_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html><head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Subsonic</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("?v=6.1\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    Mousetrap.bind('space', function() { getPlayerWindow().keyboardShortcut(\"togglePlayPause\"); return false });\r\n");
      out.write("    Mousetrap.bind('left', function() { getPlayerWindow().keyboardShortcut(\"previous\") });\r\n");
      out.write("    Mousetrap.bind('right', function() { getPlayerWindow().keyboardShortcut(\"next\") });\r\n");
      out.write("    Mousetrap.bind('shift+left', function() { getPlayerWindow().keyboardShortcut(\"seekBackward\") });\r\n");
      out.write("    Mousetrap.bind('shift+right', function() { getPlayerWindow().keyboardShortcut(\"seekForward\") });\r\n");
      out.write("    Mousetrap.bind('-', function() { getPlayerWindow().keyboardShortcut(\"volumeDown\") });\r\n");
      out.write("    Mousetrap.bind('*', function() { getPlayerWindow().keyboardShortcut(\"star\") });\r\n");
      out.write("    Mousetrap.bind('plus', function() { getPlayerWindow().keyboardShortcut(\"volumeUp\") });\r\n");
      out.write("    Mousetrap.bind('m', function() { parent.frames.upper.keyboardShortcut(\"toggleSideBar\") });\r\n");
      out.write("    Mousetrap.bind('q', function() { parent.frames.playQueue.keyboardShortcut(\"togglePlayQueue\") });\r\n");
      out.write("    Mousetrap.bind('l', function() { parent.frames.main.keyboardShortcut(\"toggleViewAsList\") });\r\n");
      out.write("    Mousetrap.bind('g h', function() { parent.frames.upper.keyboardShortcut(\"showHome\") });\r\n");
      out.write("    Mousetrap.bind('g i', function() { parent.frames.upper.keyboardShortcut(\"showIndex\") });\r\n");
      out.write("    Mousetrap.bind('g p', function() { parent.frames.upper.keyboardShortcut(\"showPlaylists\") });\r\n");
      out.write("    Mousetrap.bind('g o', function() { parent.frames.upper.keyboardShortcut(\"showPodcasts\") });\r\n");
      out.write("    Mousetrap.bind('g s', function() { parent.frames.upper.keyboardShortcut(\"showSettings\") });\r\n");
      out.write("    Mousetrap.bind('g d', function() { parent.frames.upper.keyboardShortcut(\"showInternetRadio\") });\r\n");
      out.write("    Mousetrap.bind('g b', function() { parent.frames.upper.keyboardShortcut(\"showBookmarks\") });\r\n");
      out.write("    Mousetrap.bind('g t', function() { parent.frames.upper.keyboardShortcut(\"showStarred\") });\r\n");
      out.write("    Mousetrap.bind('g r', function() { parent.frames.upper.keyboardShortcut(\"showMore\") });\r\n");
      out.write("    Mousetrap.bind('g a', function() { parent.frames.upper.keyboardShortcut(\"showAbout\") });\r\n");
      out.write("    Mousetrap.bind('/', function() { parent.frames.upper.keyboardShortcut(\"search\"); return false });\r\n");
      out.write("    Mousetrap.bind('?', function() { parent.frames.upper.keyboardShortcut(\"showMore\", \"shortcuts\")});\r\n");
      out.write("\r\n");
      out.write("    var indices = \"abcdefghijklmnopqrstuvwxyz\";\r\n");
      out.write("    for (var i = 0, len = indices.length; i < len; i++) {\r\n");
      out.write("        var target = indices.substring(i, i + 1);\r\n");
      out.write("        createKeyboardShortcutForIndex(target);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getPlayerWindow() {\r\n");
      out.write("        if (parent.frames.main == null) {\r\n");
      out.write("            return window;\r\n");
      out.write("        }\r\n");
      out.write("        if (parent.frames.main.location.href.indexOf(\"videoPlayer.view\") == -1) {\r\n");
      out.write("            return parent.frames.playQueue;\r\n");
      out.write("        }\r\n");
      out.write("        return parent.frames.main;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function createKeyboardShortcutForIndex(index) {\r\n");
      out.write("        Mousetrap.bind(\"i \" + index, function() {\r\n");
      out.write("            parent.frames.upper.keyboardShortcut(\"showIndex\", index.toUpperCase());\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\" >\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.gstatic.com/cv/js/sender/v1/cast_sender.js\"></script>\r\n");
      out.write("    ");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("(function () {\r\n");
      out.write("    'use strict';\r\n");
      out.write("\r\n");
      out.write("    var CastPlayer = function (init) {\r\n");
      out.write("\r\n");
      out.write("        this.castSession = null;\r\n");
      out.write("        this.mediaSession = null;\r\n");
      out.write("        this.volume = 1.0;\r\n");
      out.write("\r\n");
      out.write("        if (init) {\r\n");
      out.write("            this.initializeCastPlayer();\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.initializeCastPlayer = function () {\r\n");
      out.write("        if (!window.chrome) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        if (!chrome.cast || !chrome.cast.isAvailable) {\r\n");
      out.write("            setTimeout(this.initializeCastPlayer.bind(this), 1000);\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var applicationID = \"4FBFE470\";\r\n");
      out.write("        var sessionRequest = new chrome.cast.SessionRequest(applicationID);\r\n");
      out.write("        var apiConfig = new chrome.cast.ApiConfig(sessionRequest,\r\n");
      out.write("                this.sessionListener.bind(this),\r\n");
      out.write("                this.receiverListener.bind(this));\r\n");
      out.write("        chrome.cast.initialize(apiConfig, this.onInitSuccess.bind(this), this.onError.bind(this));\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * session listener during initialization\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.sessionListener = function (s) {\r\n");
      out.write("        this.log('New session ID:' + s.sessionId);\r\n");
      out.write("        this.castSession = s;\r\n");
      out.write("        this.setCastControlsVisible(true);\r\n");
      out.write("        if (this.castSession.media.length > 0) {\r\n");
      out.write("            this.log('Found ' + this.castSession.media.length + ' existing media sessions.');\r\n");
      out.write("            this.onMediaDiscovered('onRequestSessionSuccess_', this.castSession.media[0]);\r\n");
      out.write("        }\r\n");
      out.write("        this.castSession.addMediaListener(this.onMediaDiscovered.bind(this, 'addMediaListener'));\r\n");
      out.write("        this.castSession.addUpdateListener(this.sessionUpdateListener.bind(this));\r\n");
      out.write("        this.syncControls();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * receiver listener during initialization\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.receiverListener = function (e) {\r\n");
      out.write("        if (e === 'available') {\r\n");
      out.write("            this.log(\"receiver found\");\r\n");
      out.write("            $(\"#castOn\").show();\r\n");
      out.write("            $(\"#castOff\").hide();\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            this.log(\"receiver list empty\");\r\n");
      out.write("            $(\"#castOn\").hide();\r\n");
      out.write("            $(\"#castOff\").hide();\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * session update listener\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.sessionUpdateListener = function (isAlive) {\r\n");
      out.write("        var message = isAlive ? 'Session Updated' : 'Session Removed';\r\n");
      out.write("        message += ': ' + this.castSession.sessionId;\r\n");
      out.write("        this.log(message);\r\n");
      out.write("        if (!isAlive) {\r\n");
      out.write("            this.castSession = null;\r\n");
      out.write("            this.setCastControlsVisible(false);\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.onInitSuccess = function () {\r\n");
      out.write("        this.log(\"init success\");\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.onError = function () {\r\n");
      out.write("        this.log(\"error\");\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.setCastControlsVisible = function (visible) {\r\n");
      out.write("        $(\"#castOff\").toggle(visible);\r\n");
      out.write("        $(\"#castOn\").toggle(!visible);\r\n");
      out.write("        $(\"#progress\").toggle(!visible);\r\n");
      out.write("        $(\"#progress-and-duration\").toggle(!visible);\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * launch app and request session\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.launchCastApp = function () {\r\n");
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * Stops the running receiver application associated with the session.\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.stopCastApp = function () {\r\n");
      out.write("        this.castSession.stop(this.onStopAppSuccess.bind(this, 'Session stopped'),\r\n");
      out.write("                this.onError.bind(this));\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * Callback function for stop app success\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.onStopAppSuccess = function (message) {\r\n");
      out.write("        console.log(message);\r\n");
      out.write("        this.mediaSession = null;\r\n");
      out.write("        this.syncControls();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * callback on success for requestSession call\r\n");
      out.write("     * @param {Object} s A non-null new session.\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.onRequestSessionSuccess = function (s) {\r\n");
      out.write("        this.log(\"session success: \" + s.sessionId);\r\n");
      out.write("        this.castSession = s;\r\n");
      out.write("\r\n");
      out.write("        var position = -1;\r\n");
      out.write("        if (localPlayer && !localPlayer.paused) {\r\n");
      out.write("            position = Math.round(localPlayer.currentTime);\r\n");
      out.write("            localPlayer.pause();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        this.setCastControlsVisible(true);\r\n");
      out.write("        this.castSession.addUpdateListener(this.sessionUpdateListener.bind(this));\r\n");
      out.write("        this.syncControls();\r\n");
      out.write("\r\n");
      out.write("        // Continue song at same position?\r\n");
      out.write("        if (position != -1) {\r\n");
      out.write("            skip(getCurrentSongIndex(), position, true);\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.onLaunchError = function () {\r\n");
      out.write("        this.log(\"launch error\");\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.loadCastMedia = function (song, position) {\r\n");
      out.write("        if (!this.castSession) {\r\n");
      out.write("            this.log(\"no session\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        this.log(\"loading...\" + song.remoteStreamUrl);\r\n");
      out.write("        var mediaInfo = new chrome.cast.media.MediaInfo(song.remoteStreamUrl);\r\n");
      out.write("        mediaInfo.contentType = song.contentType;\r\n");
      out.write("        mediaInfo.streamType = chrome.cast.media.StreamType.BUFFERED;\r\n");
      out.write("        mediaInfo.duration = song.duration;\r\n");
      out.write("        mediaInfo.metadata = new chrome.cast.media.MusicTrackMediaMetadata();\r\n");
      out.write("        mediaInfo.metadata.metadataType = chrome.cast.media.MetadataType.MUSIC_TRACK;\r\n");
      out.write("        mediaInfo.metadata.songName = song.title;\r\n");
      out.write("        mediaInfo.metadata.title = song.title;\r\n");
      out.write("        mediaInfo.metadata.albumName = song.album;\r\n");
      out.write("        mediaInfo.metadata.artist = song.artist;\r\n");
      out.write("        mediaInfo.metadata.trackNumber = song.trackNumber;\r\n");
      out.write("        mediaInfo.metadata.images = [new chrome.cast.Image(song.remoteCoverArtUrl + \"&size=384\")];\r\n");
      out.write("        mediaInfo.metadata.releaseYear = song.year;\r\n");
      out.write("\r\n");
      out.write("        var request = new chrome.cast.media.LoadRequest(mediaInfo);\r\n");
      out.write("        request.autoplay = true;\r\n");
      out.write("        request.currentTime = position;\r\n");
      out.write("\r\n");
      out.write("        this.castSession.loadMedia(request,\r\n");
      out.write("                this.onMediaDiscovered.bind(this, 'loadMedia'),\r\n");
      out.write("                this.onMediaError.bind(this));\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * callback on success for loading media\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.onMediaDiscovered = function (how, ms) {\r\n");
      out.write("        this.mediaSession = ms;\r\n");
      out.write("        this.log(\"new media session ID:\" + this.mediaSession.mediaSessionId + ' (' + how + ')');\r\n");
      out.write("        this.log(ms);\r\n");
      out.write("        this.mediaSession.addUpdateListener(this.onMediaStatusUpdate.bind(this));\r\n");
      out.write("        this.syncControls();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * callback on media loading error\r\n");
      out.write("     * @param {Object} e A non-null media object\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.onMediaError = function (e) {\r\n");
      out.write("        this.log(\"media error\");\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * callback for media status event\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.onMediaStatusUpdate = function () {\r\n");
      out.write("        this.log(this.mediaSession.playerState);\r\n");
      out.write("        if (this.mediaSession.playerState === chrome.cast.media.PlayerState.IDLE && this.mediaSession.idleReason === \"FINISHED\") {\r\n");
      out.write("            onNext(repeatEnabled);\r\n");
      out.write("        }\r\n");
      out.write("        this.syncControls();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.playCast = function () {\r\n");
      out.write("        if (!this.mediaSession) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        this.mediaSession.play(null, this.mediaCommandSuccessCallback.bind(this, \"playing started for \" + this.mediaSession.sessionId),\r\n");
      out.write("                this.onError.bind(this));\r\n");
      out.write("        $(\"#startButton\").hide();\r\n");
      out.write("        $(\"#stopButton\").show();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.pauseCast = function () {\r\n");
      out.write("        if (!this.mediaSession) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        this.mediaSession.pause(null, this.mediaCommandSuccessCallback.bind(this, \"paused \" + this.mediaSession.sessionId),\r\n");
      out.write("                this.onError.bind(this));\r\n");
      out.write("        $(\"#startButton\").show();\r\n");
      out.write("        $(\"#stopButton\").hide();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * set receiver volume\r\n");
      out.write("     * @param {Number} level A number for volume level\r\n");
      out.write("     * @param {Boolean} mute A true/false for mute/unmute\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.setCastVolume = function (level, mute) {\r\n");
      out.write("        if (!this.castSession)\r\n");
      out.write("            return;\r\n");
      out.write("        this.castSession.setReceiverVolumeLevel(level, this.mediaCommandSuccessCallback.bind(this, 'media set-volume done'),\r\n");
      out.write("                this.onError.bind(this));\r\n");
      out.write("        this.castSession.setReceiverMuted(mute, this.mediaCommandSuccessCallback.bind(this, 'media set-volume done'),\r\n");
      out.write("                this.onError.bind(this));\r\n");
      out.write("        this.volume = level;\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.castMute = function (mute) {\r\n");
      out.write("        this.setCastVolume(this.volume, mute);\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * callback on success for media commands\r\n");
      out.write("     * @param {string} info A message string\r\n");
      out.write("     */\r\n");
      out.write("    CastPlayer.prototype.mediaCommandSuccessCallback = function (info) {\r\n");
      out.write("        this.log(info);\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.syncControls = function () {\r\n");
      out.write("        if (this.castSession && this.castSession.receiver.volume) {\r\n");
      out.write("            this.volume = this.castSession.receiver.volume.level;\r\n");
      out.write("            var muted = this.castSession.receiver.volume.muted;\r\n");
      out.write("            $(\"#muteOn\").toggle(!muted);\r\n");
      out.write("            $(\"#muteOff\").toggle(muted);\r\n");
      out.write("            $(\"#volume\").slider(\"option\", \"value\", Math.round(this.volume * 100));\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var playing = this.mediaSession != null && (this.mediaSession.playerState === chrome.cast.media.PlayerState.PLAYING);\r\n");
      out.write("        var buffering = this.mediaSession != null && (this.mediaSession.playerState === chrome.cast.media.PlayerState.BUFFERING);\r\n");
      out.write("        $(\"#stopButton\").toggle(playing && !buffering);\r\n");
      out.write("        $(\"#startButton\").toggle(!playing && !buffering);\r\n");
      out.write("        $(\"#bufferButton\").toggle(buffering);\r\n");
      out.write("        $(\".fa-circle-o-notch\").toggleClass(\"fa-spin\", playing);\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    CastPlayer.prototype.log = function (message) {\r\n");
      out.write("        console.log(message);\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    window.CastPlayer = CastPlayer;\r\n");
      out.write("})();\r\n");
      out.write("\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .ui-slider .ui-slider-handle {\r\n");
      out.write("            width: 12px; height: 12px; cursor: pointer;\r\n");
      out.write("            background: #E65100;\r\n");
      out.write("            display:none;\r\n");
      out.write("            border:none;\r\n");
      out.write("        }\r\n");
      out.write("        .ui-slider {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border:none;\r\n");
      out.write("        }\r\n");
      out.write("        .ui-slider-range-min {\r\n");
      out.write("            background: #E65100;\r\n");
      out.write("        }\r\n");
      out.write("        .ui-slider-handle:focus {\r\n");
      out.write("            outline:none;\r\n");
      out.write("        }\r\n");
      out.write("        #empty, #playQueueTable {\r\n");
      out.write("            display:none;\r\n");
      out.write("        }\r\n");
      out.write("        #startButton, #stopButton {\r\n");
      out.write("            cursor:pointer; font-size:30px; color:#E65100;\r\n");
      out.write("        }\r\n");
      out.write("        #bufferButton {\r\n");
      out.write("            font-size:30px; color:#E65100\r\n");
      out.write("        }\r\n");
      out.write("        #previousButton, #nextButton {\r\n");
      out.write("            cursor:pointer; font-size:18px; padding:10px; margin-left:10px; margin-right:10px\r\n");
      out.write("        }\r\n");
      out.write("        #muteOn, #muteOff {\r\n");
      out.write("            cursor:pointer; font-size:20px; padding:8px\r\n");
      out.write("        }\r\n");
      out.write("        #collapse, #expand, #castOn, #castOff, #repeatOn, #repeatOff, #shuffle, #starCurrentSong, #unstarCurrentSong {\r\n");
      out.write("            margin-left:12px; margin-right:12px; cursor:pointer; display:none;\r\n");
      out.write("        }\r\n");
      out.write("        #castOff, #collapse, #repeatOff {\r\n");
      out.write("            color: #E65100;\r\n");
      out.write("        }\r\n");
      out.write("        #startButton:hover, #stopButton:hover {\r\n");
      out.write("            opacity: 0.8;\r\n");
      out.write("        }\r\n");
      out.write("        #songName {\r\n");
      out.write("            cursor:pointer; font-weight:600; display:block;\r\n");
      out.write("        }\r\n");
      out.write("        #artistName {\r\n");
      out.write("            cursor:pointer; font-weight:300; display:block;\r\n");
      out.write("        }\r\n");
      out.write("        #coverArt {\r\n");
      out.write("            cursor:pointer; width:80px; height:80px;\r\n");
      out.write("        }\r\n");
      out.write("        #volume {\r\n");
      out.write("            width:100px; height:3px; margin-right:20px\r\n");
      out.write("        }\r\n");
      out.write("        #progress {\r\n");
      out.write("            height:3px; margin: 5px 20px 10px 10px;\r\n");
      out.write("        }\r\n");
      out.write("        #startButton, #stopButton, #bufferButton, #previousButton, #nextButton, #muteOn, #muteOff, #collapse, #expand, #castOn, #castOff,\r\n");
      out.write("        #repeatOn, #repeatOff, #shuffle, #starCurrentSong, #unstarCurrentSong, #progress-and-duration {\r\n");
      out.write("            user-select: none; -webkit-user-select: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Work-around for Safari */\r\n");
      out.write("        #starCurrentSong, #unstarCurrentSong, #repeatOn, #repeatOff, #shuffle, #expand, #collapse {\r\n");
      out.write("            width: 24px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("    var songs = null;\r\n");
      out.write("    var currentMediaFileId = null;\r\n");
      out.write("    var repeatEnabled = false;\r\n");
      out.write("    var castPlayer;\r\n");
      out.write("    var localPlayer = null;\r\n");
      out.write("    var jukeboxPlayer = false;\r\n");
      out.write("    var externalPlayer = false;\r\n");
      out.write("    var externalPlayerWithPlaylist = false;\r\n");
      out.write("    var autoHide = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.autoHide}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("    var collapsed = true;\r\n");
      out.write("    var currentPosition = 0;\r\n");
      out.write("\r\n");
      out.write("    function init() {\r\n");
      out.write("\r\n");
      out.write("        jukeboxPlayer = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.jukebox}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        externalPlayer = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.external}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        externalPlayerWithPlaylist = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.externalWithPlaylist}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        castPlayer = new CastPlayer(!jukeboxPlayer && !externalPlayer && !externalPlayerWithPlaylist);\r\n");
      out.write("        initMouseListener();\r\n");
      out.write("\r\n");
      out.write("        dwr.engine.setErrorHandler(null);\r\n");
      out.write("\r\n");
      out.write("        $(\"#dialog-select-playlist\").dialog({resizable: true, height: 220, autoOpen: false,\r\n");
      out.write("            buttons: {\r\n");
      out.write("                \"");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("\": function() {\r\n");
      out.write("                    $(this).dialog(\"close\");\r\n");
      out.write("                }\r\n");
      out.write("            }});\r\n");
      out.write("\r\n");
      out.write("        $(\"#progress\").slider({max: 0, range: \"min\"});\r\n");
      out.write("        $(\"#volume\").slider({max: 100, value: 50, animate: \"fast\", range: \"min\"});\r\n");
      out.write("        $(\"#volume\").on(\"slidestop\", onVolumeChanged);\r\n");
      out.write("        $(\"#progress\").on(\"slidestop\", onProgressChanged);\r\n");
      out.write("        $(\".ui-slider\").css(\"background\", $(\"#dummy\").css(\"background-color\"));\r\n");
      out.write("        $(\"#expand\").toggle(!autoHide);\r\n");
      out.write("\r\n");
      out.write("        if (!externalPlayerWithPlaylist) {\r\n");
      out.write("            $(\"#playlistBody\").sortable({\r\n");
      out.write("                stop: function (event, ui) {\r\n");
      out.write("                    var indexes = [];\r\n");
      out.write("                    $(\"#playlistBody\").children().each(function () {\r\n");
      out.write("                        var id = $(this).attr(\"id\").replace(\"pattern\", \"\");\r\n");
      out.write("                        if (id.length > 0) {\r\n");
      out.write("                            indexes.push(parseInt(id) - 1);\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    onRearrange(indexes);\r\n");
      out.write("                },\r\n");
      out.write("                cursor: \"move\",\r\n");
      out.write("                axis: \"y\",\r\n");
      out.write("                containment: \"parent\",\r\n");
      out.write("                helper: function (e, tr) {\r\n");
      out.write("                    var originals = tr.children();\r\n");
      out.write("                    var trclone = tr.clone();\r\n");
      out.write("                    trclone.children().each(function (index) {\r\n");
      out.write("                        // Set cloned cell sizes to match the original sizes\r\n");
      out.write("                        $(this).width(originals.eq(index).width());\r\n");
      out.write("                        $(this).css(\"maxWidth\", originals.eq(index).width());\r\n");
      out.write("                        $(this).css(\"border-top\", \"1px solid black\");\r\n");
      out.write("                        $(this).css(\"border-bottom\", \"1px solid black\");\r\n");
      out.write("                    });\r\n");
      out.write("                    return trclone;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        if (jukeboxPlayer || externalPlayer || externalPlayerWithPlaylist) {\r\n");
      out.write("            startTimer();\r\n");
      out.write("            $(\"#progress\").hide();\r\n");
      out.write("            $(\"#progress-and-duration\").hide();\r\n");
      out.write("        }\r\n");
      out.write("        if (externalPlayer || externalPlayerWithPlaylist) {\r\n");
      out.write("            $(\"#volume\").hide();\r\n");
      out.write("            $(\"#muteOn\").hide();\r\n");
      out.write("            $(\"#muteOff\").hide();\r\n");
      out.write("        }\r\n");
      out.write("        if (externalPlayerWithPlaylist) {\r\n");
      out.write("            $(\"#nextButton\").hide();\r\n");
      out.write("            $(\"#previousButton\").hide();\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#shuffle\").toggle(!externalPlayerWithPlaylist);\r\n");
      out.write("\r\n");
      out.write("        getPlayQueue();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function initMouseListener() {\r\n");
      out.write("        $(\"body\").mouseleave(function (event) {\r\n");
      out.write("            if (event.clientY < 30) {\r\n");
      out.write("                if (autoHide) {\r\n");
      out.write("                    collapse();\r\n");
      out.write("                }\r\n");
      out.write("                $(\".ui-slider-handle\").fadeOut();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"body\").mouseenter(function () {\r\n");
      out.write("            $(\".ui-slider-handle\").fadeIn();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#expand-target\").mouseenter(function () {\r\n");
      out.write("            if (autoHide) {\r\n");
      out.write("                expand();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function collapse() {\r\n");
      out.write("        collapsed = true;\r\n");
      out.write("        parent.setPlayQueueHeight(95);\r\n");
      out.write("        $(\"#collapse\").hide();\r\n");
      out.write("        $(\"#expand\").toggle(!autoHide);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function expand() {\r\n");
      out.write("        collapsed = false;\r\n");
      out.write("        var height = $(\"body\").height() + 25;\r\n");
      out.write("        height = Math.min(height, window.top.innerHeight * 0.8);\r\n");
      out.write("        parent.setPlayQueueHeight(height);\r\n");
      out.write("        $(\"#expand\").hide();\r\n");
      out.write("        $(\"#collapse\").toggle(!autoHide);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function startTimer() {\r\n");
      out.write("        <!-- Periodically check if the current song has changed. -->\r\n");
      out.write("        nowPlayingService.getNowPlayingForCurrentPlayer(nowPlayingCallback);\r\n");
      out.write("        setTimeout(\"startTimer()\", 5000);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function nowPlayingCallback(nowPlayingInfo) {\r\n");
      out.write("        if (nowPlayingInfo != null && nowPlayingInfo.mediaFileId != currentMediaFileId) {\r\n");
      out.write("            getPlayQueue();\r\n");
      out.write("            currentMediaFileId = nowPlayingInfo.mediaFileId;\r\n");
      out.write("            updateCurrentImage();\r\n");
      out.write("            updateCoverArt(songs[getCurrentSongIndex()]);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function createPlayer() {\r\n");
      out.write("        localPlayer = new Audio();\r\n");
      out.write("\r\n");
      out.write("        localPlayer.addEventListener(\"ended\", function() {setBookmark(); onNext(repeatEnabled)});\r\n");
      out.write("        localPlayer.addEventListener(\"canplay\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"canplaythrough\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"loadeddata\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"loadedmetadata\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"loadstart\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"seeked\", function() {setBookmark(); updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"seeking\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"stalled\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"suspend\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"error\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"waiting\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"play\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"playing\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"pause\", function() {setBookmark(); updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"volumechange\", function() {updateControls()});\r\n");
      out.write("        localPlayer.addEventListener(\"timeupdate\", function() {updateProgressBar()});\r\n");
      out.write("\r\n");
      out.write("        localPlayer.volume = 0.66;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateControls() {\r\n");
      out.write("        var ready = localPlayer.readyState == localPlayer.HAVE_FUTURE_DATA ||\r\n");
      out.write("                    localPlayer.readyState == localPlayer.HAVE_ENOUGH_DATA ||\r\n");
      out.write("                    localPlayer.networkState == localPlayer.NETWORK_NO_SOURCE;\r\n");
      out.write("\r\n");
      out.write("        var paused = localPlayer.paused;\r\n");
      out.write("        $(\"#startButton\").toggle(ready && paused);\r\n");
      out.write("        $(\"#stopButton\").toggle(ready && !paused);\r\n");
      out.write("        $(\"#bufferButton\").toggle(!ready);\r\n");
      out.write("        toggleSpinner(ready && !paused);\r\n");
      out.write("\r\n");
      out.write("        $(\"#volume\").slider(\"option\", \"value\", Math.round(localPlayer.volume * 100));\r\n");
      out.write("\r\n");
      out.write("        var muted = localPlayer.muted;\r\n");
      out.write("        $(\"#muteOn\").toggle(!muted);\r\n");
      out.write("        $(\"#muteOff\").toggle(muted);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function toggleSpinner(spin) {\r\n");
      out.write("        $(\".fa-circle-o-notch\").toggleClass(\"fa-spin\", spin);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateProgressBar() {\r\n");
      out.write("        var position = Math.round(localPlayer.currentTime);\r\n");
      out.write("        var duration = localPlayer.duration;\r\n");
      out.write("\r\n");
      out.write("        if (isNaN(duration) || !isFinite(duration)) {\r\n");
      out.write("            var currentSong = songs[getCurrentSongIndex()];\r\n");
      out.write("            duration = currentSong ? currentSong.duration : 0;\r\n");
      out.write("        } else {\r\n");
      out.write("            duration = Math.round(duration);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (position != currentPosition) {\r\n");
      out.write("            currentPosition = position;\r\n");
      out.write("            $(\"#progress\").slider(\"option\", \"value\", position * 1000);\r\n");
      out.write("\r\n");
      out.write("            if (position == 2) {\r\n");
      out.write("                playQueueService.scrobble(songs[getCurrentSongIndex()].id, false);\r\n");
      out.write("            }\r\n");
      out.write("            else if (duration > 0 && position == Math.round(duration / 2)) {\r\n");
      out.write("                playQueueService.scrobble(songs[getCurrentSongIndex()].id, true);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if (position % 10 == 0) {\r\n");
      out.write("                setBookmark();\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $(\"#progress\").slider(\"option\", \"max\", duration * 1000);\r\n");
      out.write("        $(\"#progress-text\").html(formatDuration(position));\r\n");
      out.write("        $(\"#duration-text\").html(formatDuration(duration));\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function setBookmark() {\r\n");
      out.write("        var song = songs[getCurrentSongIndex()];\r\n");
      out.write("        if (!song.bookmarkable) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var positionMillis = Math.round(localPlayer.currentTime * 1000);\r\n");
      out.write("        song.bookmarkPositionMillis = positionMillis;\r\n");
      out.write("        playQueueService.setBookmark(song.id, positionMillis, function (updated) {\r\n");
      out.write("            if (!updated) {\r\n");
      out.write("                song.bookmarkPositionMillis = null;\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function formatDuration(duration) {\r\n");
      out.write("        var hours = Math.floor(duration / 3600);\r\n");
      out.write("        duration = duration % 3600;\r\n");
      out.write("        var minutes = Math.floor(duration / 60);\r\n");
      out.write("        var seconds = Math.floor(duration % 60);\r\n");
      out.write("\r\n");
      out.write("        var result = \"\";\r\n");
      out.write("        if (hours > 0) {\r\n");
      out.write("            result += hours + \":\";\r\n");
      out.write("            if (minutes < 10) {\r\n");
      out.write("                result += \"0\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        result += minutes + \":\";\r\n");
      out.write("        if (seconds < 10) {\r\n");
      out.write("            result += \"0\";\r\n");
      out.write("        }\r\n");
      out.write("        result += seconds;\r\n");
      out.write("\r\n");
      out.write("        return result;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getPlayQueue() {\r\n");
      out.write("        playQueueService.getPlayQueue(playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onClear() {\r\n");
      out.write("        var ok = true;\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        if (ok) {\r\n");
      out.write("            playQueueService.clear(playQueueCallback);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onStart() {\r\n");
      out.write("        if (castPlayer.castSession) {\r\n");
      out.write("            castPlayer.playCast();\r\n");
      out.write("        } else if (localPlayer) {\r\n");
      out.write("            if (localPlayer.ended && getCurrentSongIndex() == songs.length -1) {\r\n");
      out.write("                skip(0, 0, true, true);\r\n");
      out.write("            } else {\r\n");
      out.write("                localPlayer.play();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        } else {\r\n");
      out.write("            playQueueService.start(playQueueCallback);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onStop() {\r\n");
      out.write("        if (castPlayer.castSession) {\r\n");
      out.write("            castPlayer.pauseCast();\r\n");
      out.write("        } else if (localPlayer) {\r\n");
      out.write("            localPlayer.pause();\r\n");
      out.write("        } else {\r\n");
      out.write("            playQueueService.stop(playQueueCallback);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onVolumeChanged() {\r\n");
      out.write("        var value = parseInt($(\"#volume\").slider(\"option\", \"value\"));\r\n");
      out.write("        if (castPlayer.castSession) {\r\n");
      out.write("            castPlayer.setCastVolume(value / 100, false);\r\n");
      out.write("        } else if (localPlayer) {\r\n");
      out.write("            localPlayer.volume = value / 100.0;\r\n");
      out.write("            localPlayer.muted = false;\r\n");
      out.write("        } else if (jukeboxPlayer) {\r\n");
      out.write("            playQueueService.setJukeboxGain(value / 100);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onProgressChanged() {\r\n");
      out.write("        var value = parseInt($(\"#progress\").slider(\"option\", \"value\") / 1000);\r\n");
      out.write("        if (localPlayer && !castPlayer.castSession && Math.round(localPlayer.currentTime) != value) {\r\n");
      out.write("            localPlayer.currentTime = value;\r\n");
      out.write("            localPlayer.play();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onMute(mute) {\r\n");
      out.write("        $(\"#muteOn\").toggle(!mute);\r\n");
      out.write("        $(\"#muteOff\").toggle(mute);\r\n");
      out.write("\r\n");
      out.write("        if (castPlayer.castSession) {\r\n");
      out.write("            castPlayer.castMute(mute);\r\n");
      out.write("        } else if (localPlayer) {\r\n");
      out.write("            localPlayer.muted = mute;\r\n");
      out.write("        } else if (jukeboxPlayer) {\r\n");
      out.write("            playQueueService.setJukeboxMute(mute);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function keyboardShortcut(action) {\r\n");
      out.write("        if (action == \"togglePlayPause\") {\r\n");
      out.write("            if ($(\"#startButton\").is(\":visible\")) {\r\n");
      out.write("                $(\"#startButton\").click();\r\n");
      out.write("            } else if ($(\"#stopButton\").is(\":visible\")) {\r\n");
      out.write("                $(\"#stopButton\").click();\r\n");
      out.write("            }\r\n");
      out.write("        } else if (action == \"previous\" && $(\"#previousButton\").is(\":visible\")) {\r\n");
      out.write("            $(\"#previousButton\").click();\r\n");
      out.write("        } else if (action == \"next\" && $(\"#nextButton\").is(\":visible\")) {\r\n");
      out.write("            $(\"#nextButton\").click();\r\n");
      out.write("        } else if (action == \"volumeDown\" && $(\"#volume\").is(\":visible\")) {\r\n");
      out.write("            var volume = parseInt($(\"#volume\").slider(\"option\", \"value\"));\r\n");
      out.write("            $(\"#volume\").slider(\"option\", \"value\", Math.max(0, volume - 5));\r\n");
      out.write("            onVolumeChanged();\r\n");
      out.write("        } else if (action == \"volumeUp\" && $(\"#volume\").is(\":visible\")) {\r\n");
      out.write("            var volume = parseInt($(\"#volume\").slider(\"option\", \"value\"));\r\n");
      out.write("            $(\"#volume\").slider(\"option\", \"value\", Math.min(100, volume + 5));\r\n");
      out.write("            onVolumeChanged();\r\n");
      out.write("        } else if (action == \"seekForward\") {\r\n");
      out.write("            var position = parseInt($(\"#progress\").slider(\"option\", \"value\"));\r\n");
      out.write("            var duration = parseInt($(\"#progress\").slider(\"option\", \"max\"));\r\n");
      out.write("            $(\"#progress\").slider(\"option\", \"value\", Math.min(duration, position + 1000));\r\n");
      out.write("            onProgressChanged();\r\n");
      out.write("        } else if (action == \"seekBackward\") {\r\n");
      out.write("            var position = parseInt($(\"#progress\").slider(\"option\", \"value\"));\r\n");
      out.write("            $(\"#progress\").slider(\"option\", \"value\", Math.max(0, position - 1000));\r\n");
      out.write("            onProgressChanged();\r\n");
      out.write("        } else if (action == \"star\") {\r\n");
      out.write("            if ($(\"#starCurrentSong\").is(\":visible\")) {\r\n");
      out.write("                $(\"#starCurrentSong\").click();\r\n");
      out.write("            } else if ($(\"#unstarCurrentSong\").is(\":visible\")) {\r\n");
      out.write("                $(\"#unstarCurrentSong\").click();\r\n");
      out.write("            }\r\n");
      out.write("        } else if (action == \"togglePlayQueue\") {\r\n");
      out.write("            collapsed ? expand() : collapse();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onNext(wrap) {\r\n");
      out.write("        var index = parseInt(getCurrentSongIndex()) + 1;\r\n");
      out.write("        if (wrap) {\r\n");
      out.write("            index = index % songs.length;\r\n");
      out.write("        }\r\n");
      out.write("        skip(index, 0, true, true);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function onPrevious() {\r\n");
      out.write("        if (localPlayer && !castPlayer.castSession && localPlayer.currentTime > 4.0) {\r\n");
      out.write("            skip(parseInt(getCurrentSongIndex()), 0, true, false);\r\n");
      out.write("        } else {\r\n");
      out.write("            skip(Math.max(0, parseInt(getCurrentSongIndex()) - 1), 0, true, true);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function onPlay(id) {\r\n");
      out.write("        playQueueService.play(id, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlaySingle(id) {\r\n");
      out.write("        playQueueService.playSingle(id, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayShuffle(albumListType, offset, size, genre, decade) {\r\n");
      out.write("        playQueueService.playShuffle(albumListType, offset, size, genre, decade, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayPlaylist(id, append, index) {\r\n");
      out.write("        playQueueService.playPlaylist(id, append, index, playQueueCallback);\r\n");
      out.write("        if (append) {\r\n");
      out.write("            toast(\"");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function onShufflePlaylist(id) {\r\n");
      out.write("        playQueueService.shufflePlaylist(id, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayTopSong(id, index) {\r\n");
      out.write("        playQueueService.playTopSong(id, index, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayPodcastChannel(id, append) {\r\n");
      out.write("        playQueueService.playPodcastChannel(id, append, playQueueCallback);\r\n");
      out.write("        if (append) {\r\n");
      out.write("            toast(\"");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayPodcastEpisode(id) {\r\n");
      out.write("        playQueueService.playPodcastEpisode(id, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayNewestPodcastEpisode(index) {\r\n");
      out.write("        playQueueService.playNewestPodcastEpisode(index, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayStarred() {\r\n");
      out.write("        playQueueService.playStarred(playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlayRandom(id, count) {\r\n");
      out.write("        playQueueService.playRandom(id, count, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onPlaySimilar(id, count) {\r\n");
      out.write("        playQueueService.playSimilar(id, count, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onAdd(id) {\r\n");
      out.write("        playQueueService.add(id, playQueueCallback);\r\n");
      out.write("        toast(\"");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("    }\r\n");
      out.write("    function onAddNext(id) {\r\n");
      out.write("        playQueueService.addAt(id, getCurrentSongIndex() + 1, playQueueCallback);\r\n");
      out.write("        toast(\"");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("    }\r\n");
      out.write("    function onShuffle() {\r\n");
      out.write("        playQueueService.shuffle(playQueueCallback);\r\n");
      out.write("        toast(\"");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("\")\r\n");
      out.write("    }\r\n");
      out.write("    function onStar(index) {\r\n");
      out.write("        playQueueService.toggleStar(index, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onStarCurrentSong(star) {\r\n");
      out.write("        var i = getCurrentSongIndex();\r\n");
      out.write("        if (i != -1) {\r\n");
      out.write("            onStar(i);\r\n");
      out.write("            $(\"#starCurrentSong\").toggle(!star);\r\n");
      out.write("            $(\"#unstarCurrentSong\").toggle(star);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function onRemove(index) {\r\n");
      out.write("        playQueueService.remove(index, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onRearrange(indexes) {\r\n");
      out.write("        playQueueService.rearrange(indexes, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onToggleRepeat(repeat) {\r\n");
      out.write("        playQueueService.toggleRepeat(repeat, playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onUndo() {\r\n");
      out.write("        playQueueService.undo(playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onSavePlayQueue() {\r\n");
      out.write("        var positionMillis = localPlayer ? Math.round(1000.0 * localPlayer.currentTime) : 0;\r\n");
      out.write("        playQueueService.savePlayQueue(getCurrentSongIndex(), positionMillis);\r\n");
      out.write("        toast(\"");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("    }\r\n");
      out.write("    function onLoadPlayQueue() {\r\n");
      out.write("        playQueueService.loadPlayQueue(playQueueCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function onSavePlaylist() {\r\n");
      out.write("        playlistService.createPlaylistForPlayQueue(function (playlistId) {\r\n");
      out.write("            top.main.location.href = \"playlist.view?id=\" + playlistId;\r\n");
      out.write("            toast(\"");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function onAppendPlaylist() {\r\n");
      out.write("        playlistService.getWritablePlaylists(playlistCallback);\r\n");
      out.write("    }\r\n");
      out.write("    function playlistCallback(playlists) {\r\n");
      out.write("        $(\"#dialog-select-playlist-list\").empty();\r\n");
      out.write("        for (var i = 0; i < playlists.length; i++) {\r\n");
      out.write("            var playlist = playlists[i];\r\n");
      out.write("            $(\"<p class='dense'><b><a href='#' onclick='appendPlaylist(\" + playlist.id + \")'>\" + escapeHtml(playlist.name)\r\n");
      out.write("                    + \"</a></b></p>\").appendTo(\"#dialog-select-playlist-list\");\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#dialog-select-playlist\").dialog(\"open\");\r\n");
      out.write("    }\r\n");
      out.write("    function appendPlaylist(playlistId) {\r\n");
      out.write("        $(\"#dialog-select-playlist\").dialog(\"close\");\r\n");
      out.write("\r\n");
      out.write("        var mediaFileIds = new Array();\r\n");
      out.write("        for (var i = 0; i < songs.length; i++) {\r\n");
      out.write("            if ($(\"#songIndex\" + (i + 1)).is(\":checked\")) {\r\n");
      out.write("                mediaFileIds.push(songs[i].id);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        playlistService.appendToPlaylist(playlistId, mediaFileIds, function (){\r\n");
      out.write("            top.main.location.href = \"playlist.view?id=\" + playlistId;\r\n");
      out.write("            toast(\"");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function playQueueCallback(playQueue) {\r\n");
      out.write("        songs = playQueue.entries;\r\n");
      out.write("        repeatEnabled = playQueue.repeatEnabled;\r\n");
      out.write("\r\n");
      out.write("        $(\"#repeatOn\").toggle(!repeatEnabled);\r\n");
      out.write("        $(\"#repeatOff\").toggle(repeatEnabled);\r\n");
      out.write("\r\n");
      out.write("        if (songs.length == 0) {\r\n");
      out.write("            $(\"#songCountAndDuration\").html(\"\");\r\n");
      out.write("            $(\"#empty\").show();\r\n");
      out.write("            $(\"#playQueueTable\").hide();\r\n");
      out.write("        } else {\r\n");
      out.write("            $(\"#songCountAndDuration\").html(songs.length + \" ");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;&bull;&nbsp;&nbsp;\" + playQueue.durationAsString);\r\n");
      out.write("            $(\"#empty\").hide();\r\n");
      out.write("            $(\"#playQueueTable\").show();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Delete all the rows except for the \"pattern\" row\r\n");
      out.write("        dwr.util.removeAllRows(\"playlistBody\", { filter:function(tr) {\r\n");
      out.write("            return (tr.id != \"pattern\");\r\n");
      out.write("        }});\r\n");
      out.write("\r\n");
      out.write("        // Create a new set cloned from the pattern row\r\n");
      out.write("        for (var i = 0; i < songs.length; i++) {\r\n");
      out.write("            var song  = songs[i];\r\n");
      out.write("            var id = i + 1;\r\n");
      out.write("            dwr.util.cloneNode(\"pattern\", { idSuffix:id });\r\n");
      out.write("            if ($(\"#trackNumber\" + id)) {\r\n");
      out.write("                $(\"#trackNumber\" + id).html(song.trackNumber);\r\n");
      out.write("            }\r\n");
      out.write("            $(\"#starSong\" + id).addClass(song.starred ? \"fa-star starred\" : \"fa-star-o\");\r\n");
      out.write("            if ($(\"#title\" + id)) {\r\n");
      out.write("                $(\"#title\" + id).html(song.title);\r\n");
      out.write("                $(\"#title\" + id).attr(\"title\", song.title);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#titleUrl\" + id)) {\r\n");
      out.write("                $(\"#titleUrl\" + id).html(song.title);\r\n");
      out.write("                $(\"#titleUrl\" + id).attr(\"title\", song.title);\r\n");
      out.write("                $(\"#titleUrl\" + id).click(function () {skip(this.id.substring(8) - 1, 0, true, true)});\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#album\" + id)) {\r\n");
      out.write("                $(\"#album\" + id).html(song.album);\r\n");
      out.write("                $(\"#album\" + id).attr(\"title\", song.album);\r\n");
      out.write("                $(\"#albumUrl\" + id).attr(\"href\", song.albumUrl);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#artist\" + id)) {\r\n");
      out.write("                $(\"#artist\" + id).html(song.artist);\r\n");
      out.write("                $(\"#artist\" + id).attr(\"title\", song.artist);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#genre\" + id)) {\r\n");
      out.write("                $(\"#genre\" + id).html(song.genre);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#year\" + id)) {\r\n");
      out.write("                $(\"#year\" + id).html(song.year);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#bitRate\" + id)) {\r\n");
      out.write("                $(\"#bitRate\" + id).html(song.bitRate);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#duration\" + id)) {\r\n");
      out.write("                $(\"#duration\" + id).html(song.durationAsString);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#format\" + id)) {\r\n");
      out.write("                $(\"#format\" + id).html(song.sourceFormat);\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#fileSize\" + id)) {\r\n");
      out.write("                $(\"#fileSize\" + id).html(song.fileSize);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Note: show() method causes page to scroll to top.\r\n");
      out.write("            $(\"#pattern\" + id).css(\"display\", \"table-row\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (playQueue.sendM3U) {\r\n");
      out.write("            parent.frames.main.location.href=\"play.m3u?\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (jukeboxPlayer) {\r\n");
      out.write("            $(\"#volume\").slider(\"option\", \"value\", Math.floor(playQueue.jukeboxGain * 100));\r\n");
      out.write("            $(\"#muteOn\").toggle(!playQueue.jukeboxMute);\r\n");
      out.write("            $(\"#muteOff\").toggle(playQueue.jukeboxMute);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (localPlayer) {\r\n");
      out.write("            triggerLocalPlayer(playQueue.startPlayerAt, playQueue.startPlayerAtPosition);\r\n");
      out.write("        } else {\r\n");
      out.write("            $(\"#startButton\").toggle(!playQueue.stopEnabled);\r\n");
      out.write("            $(\"#stopButton\").toggle(playQueue.stopEnabled);\r\n");
      out.write("            toggleSpinner(playQueue.stopEnabled);\r\n");
      out.write("            if (playQueue.startPlayerAt != -1) {\r\n");
      out.write("                currentMediaFileId = songs[playQueue.startPlayerAt].id;\r\n");
      out.write("                updateCoverArt(songs[playQueue.startPlayerAt]);\r\n");
      out.write("            }\r\n");
      out.write("            updateCurrentImage();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function triggerLocalPlayer(index, positionMillis) {\r\n");
      out.write("\r\n");
      out.write("        // Load first song (but don't play) if this is the initial case.\r\n");
      out.write("        if (index == -1 &&\r\n");
      out.write("            (localPlayer.networkState == localPlayer.NETWORK_EMPTY || localPlayer.networkState == localPlayer.NETWORK_NO_SOURCE) &&\r\n");
      out.write("            localPlayer.readyState == localPlayer.HAVE_NOTHING) {\r\n");
      out.write("            skip(0, 0, false, false);\r\n");
      out.write("        } else {\r\n");
      out.write("            skip(index, 0, true, true);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (positionMillis != 0) {\r\n");
      out.write("            localPlayer.currentTime = positionMillis / 1000;\r\n");
      out.write("        }\r\n");
      out.write("        updateCurrentImage();\r\n");
      out.write("        if (songs.length == 0) {\r\n");
      out.write("            localPlayer.pause();\r\n");
      out.write("            localPlayer.src = \"\";\r\n");
      out.write("            updateCoverArt(null);\r\n");
      out.write("            updateProgressBar();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateCoverArt(song) {\r\n");
      out.write("        var showAlbum = function () {\r\n");
      out.write("            parent.frames.main.location.href = \"main.view?id=\" + song.id\r\n");
      out.write("        };\r\n");
      out.write("        $(\"#coverArt\").attr(\"src\", song ? \"coverArt.view?id=\" + song.id + \"&auth=\" + song.hash + \"&size=160\" : \"\");\r\n");
      out.write("        $(\"#songName\").text(song && song.title ? song.title : \"\");\r\n");
      out.write("        $(\"#artistName\").text(song && song.artist ? song.artist : \"\");\r\n");
      out.write("        $(\"#songName\").off(\"click\");\r\n");
      out.write("        $(\"#artistName\").off(\"click\");\r\n");
      out.write("        $(\"#coverArt\").off(\"click\");\r\n");
      out.write("        $(\"#coverArt\").css(\"visibility\", song ? \"visible\" : \"hidden\");\r\n");
      out.write("        if (song) {\r\n");
      out.write("            $(\"#songName\").click(showAlbum);\r\n");
      out.write("            $(\"#artistName\").click(showAlbum);\r\n");
      out.write("            $(\"#coverArt\").click(showAlbum);\r\n");
      out.write("        }\r\n");
      out.write("        var starred = song != null && song.starred;\r\n");
      out.write("        $(\"#starCurrentSong\").toggle(!starred);\r\n");
      out.write("        $(\"#unstarCurrentSong\").toggle(starred);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function skip(index, position, play, skipToBookmark) {\r\n");
      out.write("        if (index < 0 || index >= songs.length) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var song = songs[index];\r\n");
      out.write("        currentMediaFileId = song.id;\r\n");
      out.write("        updateCurrentImage();\r\n");
      out.write("\r\n");
      out.write("        if (castPlayer.castSession) {\r\n");
      out.write("            castPlayer.loadCastMedia(song, position);\r\n");
      out.write("        } else if (localPlayer) {\r\n");
      out.write("            var url = song.streamUrl + \"&scrobble=false\";\r\n");
      out.write("            console.log(url);\r\n");
      out.write("            localPlayer.src = url;\r\n");
      out.write("            if (play) {\r\n");
      out.write("                startLocalPlayerAt(skipToBookmark && song.bookmarkPositionMillis ? Math.round(song.bookmarkPositionMillis / 1000) : null);\r\n");
      out.write("            }\r\n");
      out.write("        } else {\r\n");
      out.write("            playQueueService.skip(index, playQueueCallback);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        updateWindowTitle(song);\r\n");
      out.write("        updateCoverArt(song);\r\n");
      out.write("\r\n");
      out.write("        if (play && ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.notify}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n");
      out.write("            showNotification(song);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function startLocalPlayerAt(positionSeconds) {\r\n");
      out.write("        var promise = localPlayer.play();\r\n");
      out.write("        if (promise !== undefined) {\r\n");
      out.write("            promise.then(function () {\r\n");
      out.write("                if (positionSeconds) {\r\n");
      out.write("                    localPlayer.currentTime = positionSeconds;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        } else if (positionSeconds) {\r\n");
      out.write("            localPlayer.currentTime = positionSeconds;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateWindowTitle(song) {\r\n");
      out.write("        var title = \"\";\r\n");
      out.write("        if (song.title) {\r\n");
      out.write("            title += song.title;\r\n");
      out.write("        }\r\n");
      out.write("        if (song.title && song.artist) {\r\n");
      out.write("            title += \" - \";\r\n");
      out.write("        }\r\n");
      out.write("        if (song.artist) {\r\n");
      out.write("            title += song.artist;\r\n");
      out.write("        }\r\n");
      out.write("        top.document.title = title  + \" - Subsonic\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function showNotification(song) {\r\n");
      out.write("        if (!(\"Notification\" in window)) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        if (Notification.permission === \"granted\") {\r\n");
      out.write("            createNotification(song);\r\n");
      out.write("        }\r\n");
      out.write("        else if (Notification.permission !== 'denied') {\r\n");
      out.write("            Notification.requestPermission(function (permission) {\r\n");
      out.write("                Notification.permission = permission;\r\n");
      out.write("                if (permission === \"granted\") {\r\n");
      out.write("                    createNotification(song);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function createNotification(song) {\r\n");
      out.write("        var body = \"\";\r\n");
      out.write("        if (song.artist) {\r\n");
      out.write("            body += song.artist;\r\n");
      out.write("        }\r\n");
      out.write("        if (song.artist && song.album) {\r\n");
      out.write("            body += \" - \";\r\n");
      out.write("        }\r\n");
      out.write("        if (song.album) {\r\n");
      out.write("            body += song.album;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var n = new Notification(song.title, {\r\n");
      out.write("            tag: \"subsonic\",\r\n");
      out.write("            body: body,\r\n");
      out.write("            icon: \"coverArt.view?id=\" + song.id + \"&auth=\" + song.hash + \"&size=160\"\r\n");
      out.write("        });\r\n");
      out.write("        n.onshow = function() {\r\n");
      out.write("            setTimeout(function() {n.close()}, 5000);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateCurrentImage() {\r\n");
      out.write("        for (var i = 0; i < songs.length; i++) {\r\n");
      out.write("            var song  = songs[i];\r\n");
      out.write("            var id = i + 1;\r\n");
      out.write("            var image = $(\"#currentImage\" + id);\r\n");
      out.write("\r\n");
      out.write("            if (image) {\r\n");
      out.write("                image.toggle(song.id == currentMediaFileId);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getCurrentSongIndex() {\r\n");
      out.write("        for (var i = 0; i < songs.length; i++) {\r\n");
      out.write("            if (songs[i].id == currentMediaFileId) {\r\n");
      out.write("                return i;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        return -1;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    <!-- actionSelected() is invoked when the users selects from the \"More actions...\" combo box. -->\r\n");
      out.write("    function actionSelected(id) {\r\n");
      out.write("        var selectedIndexes = getSelectedIndexes();\r\n");
      out.write("        if (id == \"top\") {\r\n");
      out.write("            return;\r\n");
      out.write("        } else if (id == \"savePlayQueue\") {\r\n");
      out.write("            onSavePlayQueue();\r\n");
      out.write("        } else if (id == \"loadPlayQueue\") {\r\n");
      out.write("            onLoadPlayQueue();\r\n");
      out.write("        } else if (id == \"downloadPlaylist\") {\r\n");
      out.write("            location.href = \"download.view?player=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("        } else if (id == \"download\" && selectedIndexes != \"\") {\r\n");
      out.write("            location.href = \"download.view?player=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&\" + selectedIndexes;\r\n");
      out.write("        } else if (id == \"appendPlaylist\" && selectedIndexes != \"\") {\r\n");
      out.write("            onAppendPlaylist();\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#moreActions\").prop(\"selectedIndex\", 0);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function selectAll(b) {\r\n");
      out.write("        var selected = $(\"#selectAll\").is(\":checked\");\r\n");
      out.write("        $('.song-checkbox').prop('checked', selected);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getSelectedIndexes() {\r\n");
      out.write("        var result = \"\";\r\n");
      out.write("        for (var i = 0; i < songs.length; i++) {\r\n");
      out.write("            if ($(\"#songIndex\" + (i + 1)).is(\":checked\")) {\r\n");
      out.write("                result += \"i=\" + i + \"&\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        return result;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function toast(text) {\r\n");
      out.write("        $().toastmessage(\"showToast\", {\r\n");
      out.write("            text     : text,\r\n");
      out.write("            sticky   : false,\r\n");
      out.write("            position : \"middle-center\",\r\n");
      out.write("            type     : \"success\"\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bgcolor2 playlistframe\" onload=\"init()\">\r\n");
      out.write("\r\n");
      out.write("<span id=\"dummy\" class=\"bgcolor1\" style=\"display:none\"></span>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bgcolor2\" style=\"position:fixed; bottom:0; width:100%; z-index:2\">\r\n");
      out.write("    <div style=\"display:flex; margin-top:5px; margin-bottom:7px\">\r\n");
      out.write("        <img id=\"coverArt\">\r\n");
      out.write("        <div class=\"ellipsis\" style=\"flex-grow:1\">\r\n");
      out.write("            <div id=\"progress\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"expand-target\" class=\"ellipsis\" style=\"display:flex; align-items:center; margin-left:10px\">\r\n");
      out.write("                <div class=\"ellipsis\" style=\"display:flex; flex:1; align-items:center; margin-right:30px\">\r\n");
      out.write("                    <div class=\"ellipsis\" style=\"flex:1\">\r\n");
      out.write("                        <div><a id=\"songName\" class=\"ellipsis\"></a></div>\r\n");
      out.write("                        <div><a id=\"artistName\" class=\"ellipsis\"></a></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <i id=\"starCurrentSong\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("\" onclick=\"onStarCurrentSong(true)\">star_border</i>\r\n");
      out.write("                    <i id=\"unstarCurrentSong\" class=\"material-icons starred\" title=\"");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write("\" onclick=\"onStarCurrentSong(false)\">star</i>\r\n");
      out.write("                    <i id=\"repeatOn\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("\" onclick=\"onToggleRepeat(true)\">repeat</i>\r\n");
      out.write("                    <i id=\"repeatOff\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("\" onclick=\"onToggleRepeat(false)\">repeat</i>\r\n");
      out.write("                    <i id=\"shuffle\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_16(_jspx_page_context))
        return;
      out.write("\" onclick=\"onShuffle()\">shuffle</i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <i id=\"previousButton\" class=\"fa fa-step-backward\" onclick=\"onPrevious()\"></i>\r\n");
      out.write("                <span id=\"startButton\" class=\"fa-stack fa-lg\" onclick=\"onStart()\">\r\n");
      out.write("                    <i class=\"fa fa-circle fa-stack-2x fa-inverse\"></i>\r\n");
      out.write("                    <i class=\"fa fa-play-circle fa-stack-2x\"></i>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span id=\"stopButton\" class=\"fa-stack fa-lg\" onclick=\"onStop()\" style=\"display:none\">\r\n");
      out.write("                    <i class=\"fa fa-circle fa-stack-2x fa-inverse\"></i>\r\n");
      out.write("                    <i class=\"fa fa-pause-circle fa-stack-2x\"></i>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span id=\"bufferButton\" class=\"fa-stack fa-lg\" style=\"display:none\">\r\n");
      out.write("                    <i class=\"fa fa-circle fa-stack-2x\"></i>\r\n");
      out.write("                    <i class=\"fa fa-refresh fa-stack-1x fa-inverse fa-spin\"></i>\r\n");
      out.write("                </span>\r\n");
      out.write("                <i id=\"nextButton\" class=\"fa fa-step-forward\" onclick=\"onNext(repeatEnabled)\"></i>\r\n");
      out.write("                <div style=\"flex:1; display:flex; align-items:center; margin-left:30px\">\r\n");
      out.write("                    <i id=\"expand\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_17(_jspx_page_context))
        return;
      out.write("\" onclick=\"expand()\">queue_music</i>\r\n");
      out.write("                    <i id=\"collapse\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("\" onclick=\"collapse()\">queue_music</i>\r\n");
      out.write("                    <i id=\"castOn\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("\" onclick=\"castPlayer.launchCastApp()\">cast</i>\r\n");
      out.write("                    <i id=\"castOff\" class=\"material-icons\" title=\"");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("\" onclick=\"castPlayer.stopCastApp()\">cast_connected</i>\r\n");
      out.write("                    <div id=\"progress-and-duration\" class=\"detail\" style=\"flex:1; text-align:right\">\r\n");
      out.write("                        <span id=\"progress-text\">0:00</span> /\r\n");
      out.write("                        <span id=\"duration-text\">0:00</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <i id=\"muteOn\" class=\"fa fa-volume-up fa-fw\" onclick=\"onMute(true)\"></i>\r\n");
      out.write("                <i id=\"muteOff\" class=\"fa fa-volume-off fa-fw\" onclick=\"onMute(false)\" style=\"display:none\"></i>\r\n");
      out.write("                <div id=\"volume\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"display:flex; align-items:center; margin-top:1.5em\">\r\n");
      out.write("    <h2 style=\"margin:0; padding-right:5em\">");
      if (_jspx_meth_fmt_message_21(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <h2 id=\"songCountAndDuration\" style=\"text-align:right; margin:0; padding-left:2em; padding-right:1em; flex-grow:1\"></h2>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<p id=\"empty\" style=\"padding-top:1em\"><em>");
      if (_jspx_meth_fmt_message_35(_jspx_page_context))
        return;
      out.write("</em></p>\r\n");
      out.write("\r\n");
      out.write("<table id=\"playQueueTable\" class=\"music indent\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th colspan=\"2\"></th>\r\n");
      out.write("        <th class=\"fit center\"><input type=\"checkbox\" id=\"selectAll\" class=\"checkbox\" onclick=\"selectAll()\"/></th>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <th class=\"truncate\">");
      if (_jspx_meth_fmt_message_36(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_14(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_17(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody id=\"playlistBody\" style=\"cursor:pointer\">\r\n");
      out.write("        <tr id=\"pattern\" style=\"display:none;margin:0;padding:0;border:0\">\r\n");
      out.write("            <td class=\"fit\">\r\n");
      out.write("                <i id=\"starSong\" class=\"fa clickable\" onclick=\"onStar(this.id.substring(8) - 1)\"></i>\r\n");
      out.write("            </td>\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <td class=\"fit center\"><input type=\"checkbox\" class=\"checkbox song-checkbox\" id=\"songIndex\"></td>\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <td class=\"truncate\">\r\n");
      out.write("                <i id=\"currentImage\" class=\"fa fa-circle-o-notch fa-spin icon\" style=\"display:none;margin-right:0.5em\"></i>\r\n");
      out.write("                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_20(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_23(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_24(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_25(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_26(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_27(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div style=\"height:100px\"></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"dialog-select-playlist\" title=\"");
      if (_jspx_meth_fmt_message_45(_jspx_page_context))
        return;
      out.write("\" style=\"display: none;\">\r\n");
      out.write("    <p>");
      if (_jspx_meth_fmt_message_46(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("    <div id=\"dialog-select-playlist-list\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body></html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("styleSheet");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_spring_theme_0(_jspx_th_c_set_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_spring_theme_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_theme_0 = (org.springframework.web.servlet.tags.ThemeTag) _jspx_tagPool_spring_theme_code_nobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_theme_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_theme_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_0);
    _jspx_th_spring_theme_0.setCode("styleSheet");
    int[] _jspx_push_body_count_spring_theme_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_theme_0 = _jspx_th_spring_theme_0.doStartTag();
      if (_jspx_th_spring_theme_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_theme_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_theme_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_theme_0.doFinally();
      _jspx_tagPool_spring_theme_code_nobody.reuse(_jspx_th_spring_theme_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/icons/favicon.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/fonts/fonts.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${styleSheet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/style/font-awesome-4.5.0/css/font-awesome.min.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/script/mousetrap-1.5.3.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/style/smoothness/jquery-ui-1.8.18.custom.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/script/jquery.toastmessage/css/jquery.toastmessage.css");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/style/jquery.contextMenu.css");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/script/jquery-1.12.0.min.js");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/script/jquery-ui-1.11.1.min.js");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/script/jquery.toastmessage/jquery.toastmessage.js");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/script/jquery.contextMenu.js");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/script/scripts-2.0.js");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/dwr/engine.js");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent(null);
    _jspx_th_c_url_14.setValue("/dwr/util.js");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent(null);
    _jspx_th_c_url_15.setValue("/dwr/interface/nowPlayingService.js");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("/dwr/interface/playQueueService.js");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent(null);
    _jspx_th_c_url_17.setValue("/dwr/interface/playlistService.js");
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.licenseInfo.licenseOrTrialValid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        this.log(\"launching app...\");\r\n");
        out.write("        chrome.cast.requestSession(this.onRequestSessionSuccess.bind(this), this.onLaunchError.bind(this));\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        $().toastmessage('showNoticeToast', \"");
        if (_jspx_meth_fmt_message_0(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_fmt_message_0.setKey("videoPlayer.getpremium");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("common.cancel");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.web}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("createPlayer();");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.partyMode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ok = confirm(\"");
        if (_jspx_meth_fmt_message_2(_jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_fmt_message_2.setKey("playlist.confirmclear");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("main.addlast.toast");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setKey("main.addlast.toast");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setKey("main.addlast.toast");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setKey("main.addnext.toast");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(null);
    _jspx_th_fmt_message_7.setKey("playlist.toast.shuffle");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(null);
    _jspx_th_fmt_message_8.setKey("playlist.toast.saveplayqueue");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(null);
    _jspx_th_fmt_message_9.setKey("playlist.toast.saveasplaylist");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(null);
    _jspx_th_fmt_message_10.setKey("playlist.toast.appendtoplaylist");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(null);
    _jspx_th_fmt_message_11.setKey("playlist2.songs");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(null);
    _jspx_th_fmt_message_12.setKey("more.keyboard.star");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(null);
    _jspx_th_fmt_message_13.setKey("more.keyboard.star");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(null);
    _jspx_th_fmt_message_14.setKey("playlist.repeat_off");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(null);
    _jspx_th_fmt_message_15.setKey("playlist.repeat_on");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(null);
    _jspx_th_fmt_message_16.setKey("playlist.shuffle");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(null);
    _jspx_th_fmt_message_17.setKey("more.keyboard.playqueue");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(null);
    _jspx_th_fmt_message_18.setKey("more.keyboard.playqueue");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(null);
    _jspx_th_fmt_message_19.setKey("playlist.startcast");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(null);
    _jspx_th_fmt_message_20.setKey("playlist.stopcast");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent(null);
    _jspx_th_fmt_message_21.setKey("playlist.more.playlist");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.user.settingsRole and fn:length(model.players) gt 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <select name=\"player\" style=\"margin-right: 2.5em\" onchange=\"location='playQueue.view?player=' + options[selectedIndex].value;\">\r\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_0(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </select>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.players}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_forEach_0.setVar("player");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <option ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${player.id eq model.player.id ? \"selected\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${player.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${player.shortDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.web or model.player.jukebox or model.player.external}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <div class=\"header ellipsis\" style=\"padding-right:1.5em\"><i class=\"fa fa-trash icon\"></i>&nbsp;<a href=\"javascript:onClear()\">");
        if (_jspx_meth_fmt_message_22(_jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</a></div>\r\n");
        out.write("        <div class=\"header ellipsis\" style=\"padding-right:1.5em\"><i class=\"fa fa-undo icon\"></i>&nbsp;<a href=\"javascript:onUndo()\">");
        if (_jspx_meth_fmt_message_23(_jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</a></div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_fmt_message_22.setKey("playlist.clear");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_fmt_message_23.setKey("playlist.undo");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.user.settingsRole}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <div class=\"header ellipsis\" style=\"padding-right:1.5em\"><i class=\"fa fa-cog icon\"></i>&nbsp;<a href=\"playerSettings.view?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"main\">");
        if (_jspx_meth_fmt_message_24(_jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</a></div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_fmt_message_24.setKey("playlist.settings");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.web or model.player.jukebox or model.player.external}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_if_6(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        <div class=\"header ellipsis\" style=\"padding-right:1.5em\"><i class=\"fa fa-music icon\"></i>&nbsp;<a href=\"javascript:onSavePlaylist()\">");
        if (_jspx_meth_fmt_message_26(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</a></div>\r\n");
        out.write("\r\n");
        out.write("        <select id=\"moreActions\" onchange=\"actionSelected(this.options[selectedIndex].id)\">\r\n");
        out.write("            <option id=\"top\" selected=\"selected\">");
        if (_jspx_meth_fmt_message_27(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</option>\r\n");
        out.write("            <optgroup label=\"");
        if (_jspx_meth_fmt_message_28(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                <option id=\"savePlayQueue\">");
        if (_jspx_meth_fmt_message_29(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</option>\r\n");
        out.write("                <option id=\"loadPlayQueue\">");
        if (_jspx_meth_fmt_message_30(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</option>\r\n");
        out.write("                ");
        if (_jspx_meth_c_if_7(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            </optgroup>\r\n");
        out.write("            <optgroup label=\"");
        if (_jspx_meth_fmt_message_32(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                <option id=\"appendPlaylist\">");
        if (_jspx_meth_fmt_message_33(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</option>\r\n");
        out.write("                ");
        if (_jspx_meth_c_if_8(_jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            </optgroup>\r\n");
        out.write("        </select>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.user.shareRole}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"header ellipsis\" style=\"padding-right:1.5em\"><i class=\"fa fa-share-alt icon\"></i>&nbsp;<a href=\"createShare.view?player=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"main\">");
        if (_jspx_meth_fmt_message_25(_jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</a></div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_fmt_message_25.setKey("main.more.share");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_26.setKey("playlist.save");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_27.setKey("playlist.more");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_28.setKey("playlist.more.playlist");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_29.setKey("playlist.saveplayqueue");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_30.setKey("playlist.loadplayqueue");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.user.downloadRole}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <option id=\"downloadPlaylist\">");
        if (_jspx_meth_fmt_message_31(_jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</option>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_fmt_message_31.setKey("common.download");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_32.setKey("playlist.more.selection");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_33.setKey("playlist.append");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.user.downloadRole}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <option id=\"download\">");
        if (_jspx_meth_fmt_message_34(_jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</option>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_fmt_message_34.setKey("common.download");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent(null);
    _jspx_th_fmt_message_35.setKey("playlist.empty");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.trackNumberVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit right\">#</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_36.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_36.setParent(null);
    _jspx_th_fmt_message_36.setKey("lyrics.song");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.albumVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"truncate\">");
        if (_jspx_meth_fmt_message_37(_jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_37.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_fmt_message_37.setKey("personalsettings.album");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.artistVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"truncate\">");
        if (_jspx_meth_fmt_message_38(_jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_fmt_message_38.setKey("personalsettings.artist");
    int _jspx_eval_fmt_message_38 = _jspx_th_fmt_message_38.doStartTag();
    if (_jspx_th_fmt_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.durationVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit center\"><i class=\"fa fa-lg fa-clock-o\"></i></th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent(null);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.genreVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit left\">");
        if (_jspx_meth_fmt_message_39(_jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_39.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_fmt_message_39.setKey("personalsettings.genre");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }

  private boolean _jspx_meth_c_if_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent(null);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.yearVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit left\">");
        if (_jspx_meth_fmt_message_40(_jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_40.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_fmt_message_40.setKey("personalsettings.year");
    int _jspx_eval_fmt_message_40 = _jspx_th_fmt_message_40.doStartTag();
    if (_jspx_th_fmt_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
    return false;
  }

  private boolean _jspx_meth_c_if_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent(null);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.formatVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit left\">");
        if (_jspx_meth_fmt_message_41(_jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_41.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_fmt_message_41.setKey("personalsettings.format");
    int _jspx_eval_fmt_message_41 = _jspx_th_fmt_message_41.doStartTag();
    if (_jspx_th_fmt_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
    return false;
  }

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.fileSizeVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit left\">");
        if (_jspx_meth_fmt_message_42(_jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_42.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_fmt_message_42.setKey("personalsettings.filesize");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }

  private boolean _jspx_meth_c_if_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent(null);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.bitRateVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <th class=\"fit left\">");
        if (_jspx_meth_fmt_message_43(_jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("</th>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_fmt_message_43.setKey("personalsettings.bitrate");
    int _jspx_eval_fmt_message_43 = _jspx_th_fmt_message_43.doStartTag();
    if (_jspx_th_fmt_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
    return false;
  }

  private boolean _jspx_meth_c_if_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent(null);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not model.player.externalWithPlaylist}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit\">\r\n");
        out.write("                    <i id=\"removeSong\" class=\"fa fa-remove clickable icon\" onclick=\"onRemove(this.id.substring(10) - 1)\" title=\"");
        if (_jspx_meth_fmt_message_44(_jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("\"></i>\r\n");
        out.write("                </td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_44.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_fmt_message_44.setKey("playlist.remove");
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
    return false;
  }

  private boolean _jspx_meth_c_if_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent(null);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.trackNumberVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit right\"><span class=\"detail\" id=\"trackNumber\">1</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_when_1(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_1(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.player.externalWithPlaylist}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <span id=\"title\" class=\"songTitle\">Title</span>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <span class=\"songTitle\"><a id=\"titleUrl\" href=\"javascript:void(0)\">Title</a></span>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_if_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent(null);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.albumVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"truncate\"><a id=\"albumUrl\" target=\"main\"><span id=\"album\" class=\"detail\">Album</span></a></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_c_if_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent(null);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.artistVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"truncate\"><span id=\"artist\" class=\"detail\">Artist</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_c_if_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent(null);
    _jspx_th_c_if_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.durationVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit right\"><span id=\"duration\" class=\"detail\">Duration</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_c_if_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_23.setPageContext(_jspx_page_context);
    _jspx_th_c_if_23.setParent(null);
    _jspx_th_c_if_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.genreVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_23 = _jspx_th_c_if_23.doStartTag();
    if (_jspx_eval_c_if_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"truncate\"><span id=\"genre\" class=\"detail\">Genre</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
    return false;
  }

  private boolean _jspx_meth_c_if_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_24.setPageContext(_jspx_page_context);
    _jspx_th_c_if_24.setParent(null);
    _jspx_th_c_if_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.yearVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_24 = _jspx_th_c_if_24.doStartTag();
    if (_jspx_eval_c_if_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit left\"><span id=\"year\" class=\"detail\">Year</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
    return false;
  }

  private boolean _jspx_meth_c_if_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_25.setPageContext(_jspx_page_context);
    _jspx_th_c_if_25.setParent(null);
    _jspx_th_c_if_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.formatVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_25 = _jspx_th_c_if_25.doStartTag();
    if (_jspx_eval_c_if_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit left\"><span id=\"format\" class=\"detail\">Format</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
    return false;
  }

  private boolean _jspx_meth_c_if_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_26.setPageContext(_jspx_page_context);
    _jspx_th_c_if_26.setParent(null);
    _jspx_th_c_if_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.fileSizeVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_26 = _jspx_th_c_if_26.doStartTag();
    if (_jspx_eval_c_if_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit left\"><span id=\"fileSize\" class=\"detail\">Format</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
    return false;
  }

  private boolean _jspx_meth_c_if_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_27.setPageContext(_jspx_page_context);
    _jspx_th_c_if_27.setParent(null);
    _jspx_th_c_if_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.visibility.bitRateVisible}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_27 = _jspx_th_c_if_27.doStartTag();
    if (_jspx_eval_c_if_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <td class=\"fit left\"><span id=\"bitRate\" class=\"detail\">Bit Rate</span></td>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent(null);
    _jspx_th_fmt_message_45.setKey("main.addtoplaylist.title");
    int _jspx_eval_fmt_message_45 = _jspx_th_fmt_message_45.doStartTag();
    if (_jspx_th_fmt_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
    return false;
  }

  private boolean _jspx_meth_fmt_message_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_46.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_46.setParent(null);
    _jspx_th_fmt_message_46.setKey("main.addtoplaylist.text");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
    return false;
  }
}
