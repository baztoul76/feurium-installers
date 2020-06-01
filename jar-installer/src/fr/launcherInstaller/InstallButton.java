package fr.launcherInstaller;

import javax.swing.JButton;

public class InstallButton extends JButton implements MouseListener{
  public InstallButton(String name) {
    super(name);
    this.name = name;
    this.addMouseListener(this);
  }
  @Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////
		//OS common variables :
		String os = System.getProperty("os.name");
		char chartab[] = {'a','b','c','d','e','f'};
		String user = System.getProperty("user.name");
		String C = "";
		////////////////////////////////////////////////////////////////////
		
		if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
		C = "C:/Users/"+user+"/Desktop/.Feurium/";
		} else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
		C = "";
		} else if (System.getProperty("os.name").toLowerCase().startsWith("linux")) {
		C = "";
		}///////////////////////////////////////////////////////////////////
		//folders variables :
		File bin = new File(C+"common/bin");
		File assets = new File(C+"common/assets/indexes");
		File config = new File(C+"config");
		File librairy = new File(C+"common/librairies");
		File mc = new File(C+"logs");
		File shaderpack = new File(C+"shaderpacks");
		File version = new File(C+"common/version/1.12.2");
		////////////////////////////////////////////////////////////////////
		bin.mkdirs();
		assets.mkdirs();
		librairy.mkdirs();
		shaderpack.mkdirs();
		version.mkdirs();
		mc.mkdirs();
		mc = new File(C+"resourcepacks");
		mc.mkdirs();
		mc = new File(C+"screenshots");
		mc.mkdirs();
		mc = new File(C+"server-resource-packs");
		mc.mkdirs();
		////////////////////////////////////////////////////////////////////
		//config folder:
		config.mkdirs();
		try {
		ObjectOutputStream configs_modpack = new ObjectOutputStream(
												new BufferedOutputStream(
													new FileOutputStream(
														new File(C+"config/status_modpack_entity.json"))));
		
		configs_modpack.writeObject("[]");
		}
		catch (IOException exc){
		System.out.println("erreur : "+exc);
		}
		////////////////////////////////////////////////////////////////////
		//option files :
		try {
		ObjectOutputStream options = new ObjectOutputStream(
		new BufferedOutputStream(
		new FileOutputStream(
		new File(C+"options.txt"))));
		
		options.writeObject("version:512\r\n" + 
		"invertYMouse:false\r\n" + 
		"mouseSensitivity:0.5\r\n" + 
		"fov:0.0\r\n" + 
		"gamma:10.0\r\n" + 
		"saturation:0.0\r\n" + 
		"renderDistance:8\r\n" + 
		"guiScale:2\r\n" + 
		"particles:1\r\n" + 
		"bobView:true\r\n" + 
		"anaglyph3d:false\r\n" + 
		"maxFps:260\r\n" + 
		"fboEnable:true\r\n" + 
		"difficulty:1\r\n" + 
		"fancyGraphics:true\r\n" + 
		"ao:2\r\n" + 
		"renderClouds:true\r\n" + 
		"resourcePacks:[]\r\n" + 
		"incompatibleResourcePacks:[]\r\n" + 
		"lastServer:feurium.aternos.me\r\n" + 
		"lang:en_us\r\n" + 
		"chatVisibility:0\r\n" + 
		"chatColors:true\r\n" + 
		"chatLinks:true\r\n" + 
		"chatLinksPrompt:true\r\n" + 
		"chatOpacity:1.0\r\n" + 
		"snooperEnabled:false\r\n" + 
		"fullscreen:false\r\n" + 
		"enableVsync:true\r\n" + 
		"useVbo:true\r\n" + 
		"hideServerAddress:false\r\n" + 
		"advancedItemTooltips:false\r\n" + 
		"pauseOnLostFocus:true\r\n" + 
		"touchscreen:false\r\n" + 
		"overrideWidth:0\r\n" + 
		"overrideHeight:0\r\n" + 
		"heldItemTooltips:true\r\n" + 
		"chatHeightFocused:1.0\r\n" + 
		"chatHeightUnfocused:0.44366196\r\n" + 
		"chatScale:1.0\r\n" + 
		"chatWidth:1.0\r\n" + 
		"showInventoryAchievementHint:false\r\n" + 
		"mipmapLevels:4\r\n" + 
		"forceUnicodeFont:false\r\n" + 
		"reducedDebugInfo:false\r\n" + 
		"useNativeTransport:true\r\n" + 
		"entityShadows:false\r\n" + 
		"mainHand:right\r\n" + 
		"attackIndicator:1\r\n" + 
		"showSubtitles:false\r\n" + 
		"realmsNotifications:true\r\n" + 
		"enableWeakAttacks:false\r\n" + 
		"autoJump:false\r\n" + 
		"key_key.attack:-100\r\n" + 
		"key_key.use:-99\r\n" + 
		"key_key.forward:44\r\n" + 
		"key_key.left:16\r\n" + 
		"key_key.back:31\r\n" + 
		"key_key.right:32\r\n" + 
		"key_key.jump:57\r\n" + 
		"key_key.sneak:42\r\n" + 
		"key_key.sprint:29\r\n" + 
		"key_key.drop:30\r\n" + 
		"key_key.inventory:18\r\n" + 
		"key_key.chat:20\r\n" + 
		"key_key.playerlist:15\r\n" + 
		"key_key.pickItem:-98\r\n" + 
		"key_key.command:53\r\n" + 
		"key_key.screenshot:60\r\n" + 
		"key_key.togglePerspective:63\r\n" + 
		"key_key.smoothCamera:0\r\n" + 
		"key_key.fullscreen:87\r\n" + 
		"key_key.spectatorOutlines:0\r\n" + 
		"key_key.swapHands:33\r\n" + 
		"key_key.hotbar.1:2\r\n" + 
		"key_key.hotbar.2:3\r\n" + 
		"key_key.hotbar.3:4\r\n" + 
		"key_key.hotbar.4:5\r\n" + 
		"key_key.hotbar.5:6\r\n" + 
		"key_key.hotbar.6:7\r\n" + 
		"key_key.hotbar.7:8\r\n" + 
		"key_key.hotbar.8:9\r\n" + 
		"key_key.hotbar.9:10\r\n" + 
		"soundCategory_master:0.46357617\r\n" + 
		"soundCategory_music:0.0\r\n" + 
		"soundCategory_record:1.0\r\n" + 
		"soundCategory_weather:1.0\r\n" + 
		"soundCategory_block:1.0\r\n" + 
		"soundCategory_hostile:1.0\r\n" + 
		"soundCategory_neutral:1.0\r\n" + 
		"soundCategory_player:1.0\r\n" + 
		"soundCategory_ambient:1.0\r\n" + 
		"soundCategory_voice:1.0\r\n" + 
		"modelPart_cape:true\r\n" + 
		"modelPart_jacket:true\r\n" + 
		"modelPart_left_sleeve:true\r\n" + 
		"modelPart_right_sleeve:true\r\n" + 
		"modelPart_left_pants_leg:true\r\n" + 
		"modelPart_right_pants_leg:true\r\n" + 
		"modelPart_hat:true");
		
		ObjectOutputStream optionsOf = new ObjectOutputStream(
		new BufferedOutputStream(
		new FileOutputStream(
		new File(C+"optionsof.txt"))));
		optionsOf.writeObject("ofFogType:1\r\n" + 
		"ofFogStart:0.8\r\n" + 
		"ofMipmapType:0\r\n" + 
		"ofOcclusionFancy:false\r\n" + 
		"ofSmoothFps:false\r\n" + 
		"ofSmoothWorld:true\r\n" + 
		"ofAoLevel:1.0\r\n" + 
		"ofClouds:0\r\n" + 
		"ofCloudsHeight:0.0\r\n" + 
		"ofTrees:0\r\n" + 
		"ofDroppedItems:0\r\n" + 
		"ofRain:0\r\n" + 
		"ofAnimatedWater:0\r\n" + 
		"ofAnimatedLava:0\r\n" + 
		"ofAnimatedFire:true\r\n" + 
		"ofAnimatedPortal:true\r\n" + 
		"ofAnimatedRedstone:true\r\n" + 
		"ofAnimatedExplosion:true\r\n" + 
		"ofAnimatedFlame:true\r\n" + 
		"ofAnimatedSmoke:true\r\n" + 
		"ofVoidParticles:true\r\n" + 
		"ofWaterParticles:true\r\n" + 
		"ofPortalParticles:true\r\n" + 
		"ofPotionParticles:true\r\n" + 
		"ofFireworkParticles:true\r\n" + 
		"ofDrippingWaterLava:true\r\n" + 
		"ofAnimatedTerrain:true\r\n" + 
		"ofAnimatedTextures:true\r\n" + 
		"ofRainSplash:true\r\n" + 
		"ofLagometer:false\r\n" + 
		"ofShowFps:false\r\n" + 
		"ofAutoSaveTicks:4000\r\n" + 
		"ofBetterGrass:3\r\n" + 
		"ofConnectedTextures:2\r\n" + 
		"ofWeather:true\r\n" + 
		"ofSky:true\r\n" + 
		"ofStars:true\r\n" + 
		"ofSunMoon:true\r\n" + 
		"ofVignette:0\r\n" + 
		"ofChunkUpdates:1\r\n" + 
		"ofChunkUpdatesDynamic:false\r\n" + 
		"ofTime:0\r\n" + 
		"ofClearWater:false\r\n" + 
		"ofAaLevel:0\r\n" + 
		"ofAfLevel:1\r\n" + 
		"ofProfiler:false\r\n" + 
		"ofBetterSnow:false\r\n" + 
		"ofSwampColors:true\r\n" + 
		"ofRandomEntities:true\r\n" + 
		"ofSmoothBiomes:true\r\n" + 
		"ofCustomFonts:true\r\n" + 
		"ofCustomColors:true\r\n" + 
		"ofCustomItems:true\r\n" + 
		"ofCustomSky:true\r\n" + 
		"ofShowCapes:true\r\n" + 
		"ofNaturalTextures:false\r\n" + 
		"ofEmissiveTextures:true\r\n" + 
		"ofLazyChunkLoading:true\r\n" + 
		"ofRenderRegions:false\r\n" + 
		"ofSmartAnimations:false\r\n" + 
		"ofDynamicFov:true\r\n" + 
		"ofAlternateBlocks:true\r\n" + 
		"ofDynamicLights:3\r\n" + 
		"ofScreenshotSize:1\r\n" + 
		"ofCustomEntityModels:true\r\n" + 
		"ofCustomGuis:true\r\n" + 
		"ofShowGlErrors:true\r\n" + 
		"ofFullscreenMode:Default\r\n" + 
		"ofFastMath:false\r\n" + 
		"ofFastRender:false\r\n" + 
		"ofTranslucentBlocks:0\r\n" + 
		"key_of.key.zoom:46");
		}catch (IOException ex) {
			System.out.println("erreur : "+ex);
		}
		////////////////////////////////////////////////////////////////////
		//"assets" folder
		System.out.println();
		assets = new File(C+"assets/log_config");
		assets.mkdirs();
		for (int i = 0;i<2;i++) {
		String folder="";
		if (i == 0) {
		folder = "objects/";
		}else {
		folder = "skins/";
		}
		for (int number = 0;number < 100;number++) {
		if (number < 10) {
		assets = new File(C+"assets/"+folder+"/" + 0 + number);
		}else {
		assets = new File(C+"assets/"+folder+"/"+number);
		}
		assets.mkdir();
		if (number < 10) {
		for (int carac = 0;carac < 6;carac++) {
		assets = new File(C+"assets/"+folder+number+chartab[carac]);
		assets.mkdirs();
		}
		}
		}
		for (int clong = 0;clong<6;clong++) {
		for (int longaussi=0;longaussi<10;longaussi++) {
		assets = new File(C+"assets/"+folder+chartab[clong]+longaussi);
		assets.mkdir();
		}
		for (int blabla=0;blabla<6;blabla++) {
		assets = new File(C+"assets/"+folder+chartab[clong]+chartab[clong]);
		assets.mkdir();
		}
		}
		
		}
		System.out.println(os);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
