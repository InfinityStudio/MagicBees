package magicbees.item.types;

import magicbees.main.utils.LocalizationManager;

public enum HiveFrameType
{
	MAGIC("Magic", 32, 240, 1f, 1f, 1f, 2f, 2, 5),
	RESILIENT("Resilient", 33, 840, 1f, 1f, 1f, 2f, 2, 5),
	GENTLE("Gentle", 34, 200, 1f, 0.7f, 1.5f, 1.4f, 1, 5),
	METABOLIC("Metabolic", 35, 120, 1f, 1.8f, 1f, 1.2f, 5, 5),
	NECROTIC("Necrotic", 36, 290, 1f, 1f, 0.3f, 0.75f, 1, 5),
	TEMPORAL("Temporal", 37, 300, 1f, 1f, 2.5f, 1f, 1, 5 ),
	OBLIVION("Oblivion", 38, 60, 1f, 1f, 0.0001f, 0f, 15, 1),
	;
	
	private HiveFrameType(String name, int icon, int damage,
			float territory, float mutation, float lifespan, float production,
			int auraUse, int wearTicks)
	{
		this(name, icon, damage, territory, mutation, lifespan, production, 1f, false, false, false, false, auraUse, wearTicks);
	}
	
	private HiveFrameType(String name, int icon, int damage,
			float territory, float mutation, float lifespan, float production, float flowering,
			boolean sealed, boolean lit, boolean sunlit, boolean hellish,
			int auraUse, int wearTicks)
	{
		this.frameName = name;
		this.iconIdx = icon;
		this.maxDamage = damage;
		
		this.territoryMod = territory;
		this.mutationMod = mutation;
		this.lifespanMod = lifespan;
		this.productionMod = production;
		this.floweringMod = flowering;
		this.isSealed = sealed;
		this.isLit = lit;
		this.isSunlit = sunlit;
		this.isHellish = hellish;
		
		this.auraPerUse = auraUse;
		this.wearTicksPerAura = wearTicks;
	}
	
	private String frameName;
	public int iconIdx;
	public int maxDamage;
	
	public float territoryMod;
	public float mutationMod;
	public float lifespanMod;
	public float productionMod;
	public float floweringMod;
	public boolean isSealed;
	public boolean isLit;
	public boolean isSunlit;
	public boolean isHellish;
	
	public int auraPerUse;
	public int wearTicksPerAura;
	
	public String getName()
	{
		return this.frameName;
	}
	
	public String getLocalizedName()
	{
		return LocalizationManager.getLocalizedString("tb.frame." + this.frameName);
	}
}