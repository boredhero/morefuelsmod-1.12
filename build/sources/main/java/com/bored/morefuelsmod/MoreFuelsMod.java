package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.fuels.ActivatorRail;
import com.bored.morefuelsmod.fuels.ArmorStand;
import com.bored.morefuelsmod.fuels.Arrow;
import com.bored.morefuelsmod.fuels.Bed;
import com.bored.morefuelsmod.fuels.BeetSeeds;
import com.bored.morefuelsmod.fuels.BlazePowder;
import com.bored.morefuelsmod.fuels.Book;
import com.bored.morefuelsmod.fuels.Cactus;
import com.bored.morefuelsmod.fuels.CarrotOnAStick;
import com.bored.morefuelsmod.fuels.ChorusFlowers;
import com.bored.morefuelsmod.fuels.ChorusPlant;
import com.bored.morefuelsmod.fuels.Deadbush;
import com.bored.morefuelsmod.fuels.DetectorRail;
import com.bored.morefuelsmod.fuels.DoublePlant;
import com.bored.morefuelsmod.fuels.DragonBreath;
import com.bored.morefuelsmod.fuels.ExperimentalMushroomBlocks;
import com.bored.morefuelsmod.fuels.Feather;
import com.bored.morefuelsmod.fuels.FireCharge;
import com.bored.morefuelsmod.fuels.FireworkCharge;
import com.bored.morefuelsmod.fuels.Fireworks;
import com.bored.morefuelsmod.fuels.FishingRod;
import com.bored.morefuelsmod.fuels.GhastTear;
import com.bored.morefuelsmod.fuels.Gunpowder;
import com.bored.morefuelsmod.fuels.HayBlock;
import com.bored.morefuelsmod.fuels.ItemFrame;
import com.bored.morefuelsmod.fuels.Leaves;
import com.bored.morefuelsmod.fuels.Lever;
import com.bored.morefuelsmod.fuels.MagmaCream;
import com.bored.morefuelsmod.fuels.Maps;
import com.bored.morefuelsmod.fuels.MelonSeeds;
import com.bored.morefuelsmod.fuels.MinecartWithChest;
import com.bored.morefuelsmod.fuels.MushroomItems;
import com.bored.morefuelsmod.fuels.NetherStar;
import com.bored.morefuelsmod.fuels.Painting;
import com.bored.morefuelsmod.fuels.Paper;
import com.bored.morefuelsmod.fuels.Piston;
import com.bored.morefuelsmod.fuels.PoisonousPotato;
import com.bored.morefuelsmod.fuels.PoweredRail;
import com.bored.morefuelsmod.fuels.PumpkinSeeds;
import com.bored.morefuelsmod.fuels.Rail;
import com.bored.morefuelsmod.fuels.RedFlower;
import com.bored.morefuelsmod.fuels.RedstoneTorch;
import com.bored.morefuelsmod.fuels.RottenFlesh;
import com.bored.morefuelsmod.fuels.Shield;
import com.bored.morefuelsmod.fuels.Sign;
import com.bored.morefuelsmod.fuels.SpawnEgg;
import com.bored.morefuelsmod.fuels.SpiderEye;
import com.bored.morefuelsmod.fuels.StickyPiston;
import com.bored.morefuelsmod.fuels.Sugarcane;
import com.bored.morefuelsmod.fuels.TNT;
import com.bored.morefuelsmod.fuels.TNTMinecart;
import com.bored.morefuelsmod.fuels.Torch;
import com.bored.morefuelsmod.fuels.TripwireHook;
import com.bored.morefuelsmod.fuels.Vine;
import com.bored.morefuelsmod.fuels.WaterLily;
import com.bored.morefuelsmod.fuels.Web;
import com.bored.morefuelsmod.fuels.Wheat;
import com.bored.morefuelsmod.fuels.WheatSeeds;
import com.bored.morefuelsmod.fuels.WritableBook;
import com.bored.morefuelsmod.fuels.WrittenBook;
import com.bored.morefuelsmod.fuels.YellowFlower;
import com.bored.morefuelsmod.fuels.modfuels.BituminousCoal;
import com.bored.morefuelsmod.fuels.modfuels.BituminousCoalBlock;
import com.bored.morefuelsmod.fuels.modfuels.Coke;
import com.bored.morefuelsmod.fuels.modfuels.CokeBlock;
import com.bored.morefuelsmod.fuels.modfuels.ConcentratedPelletBlock;
import com.bored.morefuelsmod.fuels.modfuels.ConcentratedPelletFuel;
import com.bored.morefuelsmod.fuels.modfuels.InfiniteCreativeFuelBlock;
import com.bored.morefuelsmod.fuels.modfuels.LavaOrb;
import com.bored.morefuelsmod.fuels.modfuels.PelletBlock;
import com.bored.morefuelsmod.fuels.modfuels.PelletFuel;
import com.bored.morefuelsmod.fuels.modfuels.Slimoline;
import com.bored.morefuelsmod.item.ModItems;
import com.bored.morefuelsmod.proxy.CommonProxy;
import com.bored.morefuelsmod.util.MoreFuelsModTab;
import com.bored.morefuelsmod.util.RFtL;
import com.bored.morefuelsmod.util.Smelting;
import com.bored.morefuelsmod.world.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = MoreFuelsMod.modId, name = MoreFuelsMod.name, version = MoreFuelsMod.version, acceptedMinecraftVersions = "[1.12, 1.12.2]")
public class MoreFuelsMod {

	public static final String modId = "morefuelsmod";
	public static final String name = "More Fuels Mod";
	public static final String version = "1.6.2";

	@Mod.Instance(modId)
	public static MoreFuelsMod instance;

	@SidedProxy(serverSide = "com.bored.morefuelsmod.proxy.CommonProxy", clientSide = "com.bored.morefuelsmod.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " " + version + " is loading!");
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 0));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 1));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 2));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 3));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 4));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 5));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 6));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 7));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 8));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 9));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 10));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 11));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 12));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 13));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 14));
		OreDictionary.registerOre("bedAny", new ItemStack(Items.BED, 1, 15));
		//Tried to add double plants to their own oreDict entry for crafting, but they do not have an item.
		//Tried to add flowers to their own oreDict entry for crafting, but they do not have an item.
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			RFtL.init();
		boolean enableNetherStar = config.get(Configuration.CATEGORY_GENERAL, "fuelenableNetherStar", true).getBoolean(true);
		if(enableNetherStar)
			GameRegistry.registerFuelHandler(new NetherStar());
		boolean enableLeaves = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeaves", true).getBoolean(true);
		if(enableLeaves)
			GameRegistry.registerFuelHandler(new Leaves());
		boolean enableDeadbush = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDeadbush", true).getBoolean(true);
		if(enableDeadbush)
			GameRegistry.registerFuelHandler(new Deadbush());
		boolean enableCactus = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCactus", true).getBoolean(true);
		if(enableCactus)
			GameRegistry.registerFuelHandler(new Cactus());
		boolean enableWeb = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWeb", true).getBoolean(true);
		if(enableWeb)
			GameRegistry.registerFuelHandler(new Web());
		boolean enableLever = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLever", true).getBoolean(true);
		if(enableLever)
			GameRegistry.registerFuelHandler(new Lever());
		boolean enableDoublePlant = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDoublePlant", true).getBoolean(true);
		if(enableDoublePlant)
			GameRegistry.registerFuelHandler(new DoublePlant());
		boolean enableRedFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRedFlower", true).getBoolean(true);
		if(enableRedFlower)
			GameRegistry.registerFuelHandler(new RedFlower());
		boolean enableYellowFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableYellowFlower", true).getBoolean(true);
		if(enableYellowFlower)
			GameRegistry.registerFuelHandler(new YellowFlower());
		boolean enableItemFrame = config.get(Configuration.CATEGORY_GENERAL, "fuelenableItemFrame", true).getBoolean(true);
		if(enableItemFrame)
			GameRegistry.registerFuelHandler(new ItemFrame());
		boolean enableBed = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBed", true).getBoolean(true);
		if(enableBed)
			GameRegistry.registerFuelHandler(new Bed());
		boolean enablePainting = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePainting", true).getBoolean(true);
		if(enablePainting)
			GameRegistry.registerFuelHandler(new Painting());
		boolean enableSign = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSign", true).getBoolean(true);
		if(enableSign)
			GameRegistry.registerFuelHandler(new Sign());
		boolean enableRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRail", true).getBoolean(true);
		if(enableRail)
			GameRegistry.registerFuelHandler(new Rail());
		boolean enableActivatorRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableActivatorRail", true).getBoolean(true);
		if(enableActivatorRail)
			GameRegistry.registerFuelHandler(new ActivatorRail());
		boolean enableDetectorRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDetectorRail", true).getBoolean(true);
		if(enableDetectorRail)
			GameRegistry.registerFuelHandler(new DetectorRail());
		boolean enablePoweredRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePoweredRail", true).getBoolean(true);
		if(enablePoweredRail)
			GameRegistry.registerFuelHandler(new PoweredRail());
		boolean enablePiston = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePiston", true).getBoolean(true);
		if(enablePiston)
			GameRegistry.registerFuelHandler(new Piston());
		boolean enableStickyPiston = config.get(Configuration.CATEGORY_GENERAL, "fuelenableStickyPiston", true).getBoolean(true);
		if(enableStickyPiston)
			GameRegistry.registerFuelHandler(new StickyPiston());
		boolean enableVine = config.get(Configuration.CATEGORY_GENERAL, "fuelenableStickyPiston", true).getBoolean(true);
		if(enableVine)
			GameRegistry.registerFuelHandler(new Vine());
		boolean enableWaterLily = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWaterLily", true).getBoolean(true);
		if(enableWaterLily)
			GameRegistry.registerFuelHandler(new WaterLily());
		boolean enableTripwireHook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTripwireHook", true).getBoolean(true);
		if(enableTripwireHook)
			GameRegistry.registerFuelHandler(new TripwireHook());
		boolean enableHayBlock = config.get(Configuration.CATEGORY_GENERAL, "fuelenableHayBlock", true).getBoolean(true);
		if(enableHayBlock)
			GameRegistry.registerFuelHandler(new HayBlock());
		boolean enableArrow = config.get(Configuration.CATEGORY_GENERAL, "fuelenableArrow", true).getBoolean(true);
		if(enableArrow)
			GameRegistry.registerFuelHandler(new Arrow());
		boolean enableFeather = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFeather", true).getBoolean(true);
		if(enableFeather)
			GameRegistry.registerFuelHandler(new Feather());
		boolean enableWheat = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWheat", true).getBoolean(true);
		if(enableWheat)
			GameRegistry.registerFuelHandler(new Wheat());
		boolean enableWheatSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWheatSeeds", true).getBoolean(true);
		if(enableWheatSeeds)
			GameRegistry.registerFuelHandler(new WheatSeeds());
		boolean enableMelonSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMelonSeeds", true).getBoolean(true);
		if(enableMelonSeeds)
			GameRegistry.registerFuelHandler(new MelonSeeds());
		boolean enablePumpkinSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePumpkinSeeds", true).getBoolean(true);
		if(enablePumpkinSeeds)
			GameRegistry.registerFuelHandler(new PumpkinSeeds());
		boolean enableBeetSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBeetSeeds", true).getBoolean(true);
		if(enableBeetSeeds)
			GameRegistry.registerFuelHandler(new BeetSeeds());
		boolean enableTorch = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTorch", true).getBoolean(true);
		if(enableTorch)
			GameRegistry.registerFuelHandler(new Torch());
		boolean enableRedstoneTorch = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRedstoneTorch", true).getBoolean(true);
		if(enableRedstoneTorch)
			GameRegistry.registerFuelHandler(new RedstoneTorch());
		boolean enableSugarcane = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSugarcane", true).getBoolean(true);
		if(enableSugarcane)
			GameRegistry.registerFuelHandler(new Sugarcane());
		boolean enablePaper = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePaper", true).getBoolean(true);
		if(enablePaper)
			GameRegistry.registerFuelHandler(new Paper());
		boolean enableBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBook", true).getBoolean(true);
		if(enableBook)
			GameRegistry.registerFuelHandler(new Book());
		boolean enableWritableBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWritableBook", true).getBoolean(true);
		if(enableWritableBook)
			GameRegistry.registerFuelHandler(new WritableBook());
		boolean enableWrittenBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWrittenBook", true).getBoolean(true);
		if(enableWrittenBook)
			GameRegistry.registerFuelHandler(new WrittenBook());
		boolean enableMinecartWithChest = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMinecartWithChest", true).getBoolean(true);
		if(enableMinecartWithChest)
			GameRegistry.registerFuelHandler(new MinecartWithChest());
		boolean enableMaps = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMaps", true).getBoolean(true);
		if(enableMaps)
			GameRegistry.registerFuelHandler(new Maps());
		boolean enableFishingRod = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFishingRod", true).getBoolean(true);
		if(enableFishingRod)
			GameRegistry.registerFuelHandler(new FishingRod());
		boolean enableCarrotOnAStick = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCarrotOnAStick", true).getBoolean(true);
		if(enableCarrotOnAStick)
			GameRegistry.registerFuelHandler(new CarrotOnAStick());
		boolean enableMushroomItems = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMushroomItems", true).getBoolean(true);
		if(enableMushroomItems)
			GameRegistry.registerFuelHandler(new MushroomItems());
		boolean enableExperimentalMushroomBlocks = config.get(Configuration.CATEGORY_GENERAL, "fuelenableExperimentalMushroomBlocks", true).getBoolean(true);
		if(enableExperimentalMushroomBlocks)
			GameRegistry.registerFuelHandler(new ExperimentalMushroomBlocks());
		boolean enableArmorStand = config.get(Configuration.CATEGORY_GENERAL, "fuelenableArmorStand", true).getBoolean(true);
		if(enableArmorStand)
			GameRegistry.registerFuelHandler(new ArmorStand());
		boolean enableFireCharge = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireCharge", true).getBoolean(true);
		if(enableFireCharge)
			GameRegistry.registerFuelHandler(new FireCharge());
		boolean enableFireworkCharge = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireworkCharge", true).getBoolean(true);
		if(enableFireworkCharge)
			GameRegistry.registerFuelHandler(new FireworkCharge());
		boolean enableFireworks = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireworks", true).getBoolean(true);
		if(enableFireworks)
			GameRegistry.registerFuelHandler(new Fireworks());
		boolean enableGunpowder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableGunpowder", true).getBoolean(true);
		if(enableGunpowder)
			GameRegistry.registerFuelHandler(new Gunpowder());
		boolean enableBlazePowder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBlazePowder", true).getBoolean(true);
		if(enableBlazePowder)
			GameRegistry.registerFuelHandler(new BlazePowder());
		boolean enableMagmaCream = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMagmaCream", true).getBoolean(true);
		if(enableMagmaCream)
			GameRegistry.registerFuelHandler(new MagmaCream());
		boolean enableGhastTear = config.get(Configuration.CATEGORY_GENERAL, "fuelenableGhastTear", true).getBoolean(true);
		if(enableGhastTear)
			GameRegistry.registerFuelHandler(new GhastTear());
		boolean enableSpawnEgg = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSpawnEgg", false).getBoolean(true);
		if(enableSpawnEgg)
			GameRegistry.registerFuelHandler(new SpawnEgg());
		boolean enablePoisonousPotato = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePoisonousPotato", true).getBoolean(true);
		if(enablePoisonousPotato)
			GameRegistry.registerFuelHandler(new PoisonousPotato());
		boolean enableRottenFlesh = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRottenFlesh", false).getBoolean(true);
		if(enableRottenFlesh)
			GameRegistry.registerFuelHandler(new RottenFlesh());
		boolean enableSpiderEye = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSpiderEye", true).getBoolean(true);
		if(enableSpiderEye)
			GameRegistry.registerFuelHandler(new SpiderEye());
		boolean enableChorusPlant = config.get(Configuration.CATEGORY_GENERAL, "fuelenableChorusPlant", true).getBoolean(true);
		if(enableChorusPlant)
			GameRegistry.registerFuelHandler(new ChorusPlant());
		boolean enableChorusFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableChorusFlower", true).getBoolean(true);
		if(enableChorusFlower)
			GameRegistry.registerFuelHandler(new ChorusFlowers());
		boolean enableShield = config.get(Configuration.CATEGORY_GENERAL, "fuelenableShield", true).getBoolean(true);
		if(enableShield)
			GameRegistry.registerFuelHandler(new Shield());
		boolean enableDragonBreath = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDragonBreath", true).getBoolean(true);
		if(enableDragonBreath)
			GameRegistry.registerFuelHandler(new DragonBreath());
		boolean enableTNT = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTNT", true).getBoolean(true);
		if(enableTNT)
			GameRegistry.registerFuelHandler(new TNT());
		boolean enableTNTMinecart = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTNTMinecart", true).getBoolean(true);
		if(enableTNTMinecart)
			GameRegistry.registerFuelHandler(new TNTMinecart());
		//Mod Fuels Start Here
		boolean enablePelletFuel = config.get(Configuration.CATEGORY_GENERAL, "modfuelenablePelletFuel", true).getBoolean(true);
		if(enablePelletFuel)
			GameRegistry.registerFuelHandler(new PelletFuel());
		boolean enableConcentratedPelletFuel = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableConcentratedPelletFuel", true).getBoolean(true);
		if(enableConcentratedPelletFuel)
			GameRegistry.registerFuelHandler(new ConcentratedPelletFuel());
		boolean enableCoke = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableCoke", true).getBoolean(true);
		if(enableCoke)
			GameRegistry.registerFuelHandler(new Coke());
		boolean enableBituminousCoal = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableBituminousCoal", true).getBoolean(true);
		if(enableBituminousCoal)
			GameRegistry.registerFuelHandler(new BituminousCoal());
		boolean enableSlimoline = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableSlimoline", true).getBoolean(true);
		if(enableSlimoline)
			GameRegistry.registerFuelHandler(new Slimoline());
		boolean enableCokeBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableCokeBlock", true).getBoolean(true);
		if(enableCokeBlock)
			GameRegistry.registerFuelHandler(new CokeBlock());
		boolean enablePelletBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenablePelletBlock", true).getBoolean(true);
		if(enablePelletBlock)
			GameRegistry.registerFuelHandler(new PelletBlock());
		boolean enableConcentratedPelletBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableConcentratedPelletBlock", true).getBoolean(true);
		if(enableConcentratedPelletBlock)
			GameRegistry.registerFuelHandler(new ConcentratedPelletBlock());
		boolean enableCreativeInfiniteFuelBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableCreativeInfiniteFuelBlock", true).getBoolean(true);
		if(enableCreativeInfiniteFuelBlock)
			GameRegistry.registerFuelHandler(new InfiniteCreativeFuelBlock());
		boolean enableBituminousCoalBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelsenableBituminousCoalBlock", true).getBoolean(true);
		if(enableBituminousCoalBlock)
			GameRegistry.registerFuelHandler(new BituminousCoalBlock());
		boolean enableLavaOrb = config.get(Configuration.CATEGORY_GENERAL, "modfuelsenableLavaOrb", true).getBoolean(true);
		if(enableLavaOrb)
GameRegistry.registerFuelHandler(new LavaOrb());
		config.save();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		Smelting.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public static final MoreFuelsModTab creativeTab = new MoreFuelsModTab();
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
		}
	}
