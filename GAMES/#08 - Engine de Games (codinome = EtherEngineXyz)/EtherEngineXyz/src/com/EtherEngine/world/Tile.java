package com.EtherEngine.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.EtherEngine.main.Game;

public class Tile {

	// ==============LISTA DE TILES==============//

	//	WALL = TILES COM COLISÃO 
	//FLOOR = CHÃO GERALMENTE PLAYER FICA POR CIMA
	
	//	public static BufferedImage Tile_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	//	public static BufferedImage Tile_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	
	//									MATO	= BUSH									//
	public static BufferedImage GrassTile_Floor  = Game.spritesheet.getSprite(400,48,16,16);
	public static BufferedImage Grass01_Floor  = Game.spritesheet.getSprite(288,112,16,16);
	public static BufferedImage Grass02_Floor  = Game.spritesheet.getSprite(288,96,16,16);
	public static BufferedImage Grass03_Wall  = Game.spritesheet.getSprite(288,128,16,16);
	public static BufferedImage Flowers_Floor   = Game.spritesheet.getSprite(416,48,16,16);
	public static BufferedImage HoleGrass_Floor  = Game.spritesheet.getSprite(256,32,16,16);
	public static BufferedImage StickGrass_Floor  = Game.spritesheet.getSprite(256,48,16,16);
	public static BufferedImage Mushroom01_Floor  = Game.spritesheet.getSprite(272,32,16,16);
	public static BufferedImage Mushroom02_Floor  = Game.spritesheet.getSprite(272,48,16,16);
	public static BufferedImage Thicket_Wall = Game.spritesheet.getSprite(352,96 ,16,16);
	   
	//											FOREST  = FLORESTA 												//
	
	// SMALL TREE = ARVORE PEQUENA A
	public static BufferedImage SmallTree01A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SmallTree02A_Floor  = Game.spritesheet.getSprite(0,0,16,16);

	public static BufferedImage SmallTree03A_Wall  = Game.spritesheet.getSprite(0,0,16,16);

	// SMALL TREE = ARVORE PEQUENA B
	public static BufferedImage SmallTree01B_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SmallTree02B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	
	public static BufferedImage SmallTree03B_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	
	// SMALL TREE = ARVORE PEQUENA C
	public static BufferedImage SmallTree01C_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SmallTree02C_Floor  = Game.spritesheet.getSprite(0,0,16,16);
		
	public static BufferedImage SmallTree03C_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	
	// SMALL TREE = ARVORE PEQUENA D
	public static BufferedImage SmallTree01D_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SmallTree02D_Floor  = Game.spritesheet.getSprite(0,0,16,16);
			
	public static BufferedImage SmallTree03D_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	
	// RED MUSHROOM  TREE = ARVORE DE COGUMELO VERMELHO
	public static BufferedImage MushroomRedTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomRedTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomRed03Tree_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomRed04Tree_Wall = Game.spritesheet.getSprite(0,0,16,16); 
	public static BufferedImage MushroomRed05Tree_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomRed06Tree_Floor  = Game.spritesheet.getSprite(0,0,16,16); 
	
	// BROWN MUSHROOM  TREE = ARVORE DE COGUMELO MARROM
	public static BufferedImage MushroomBrownTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomBrownTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomBrownTree03_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomBrownTree04_Wall = Game.spritesheet.getSprite(0,0,16,16); 
	public static BufferedImage MushroomBrownTree05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage MushroomBrownTree06_Floor  = Game.spritesheet.getSprite(0,0,16,16); 
	
	// OAK TREE = ARVORE
	public static BufferedImage OakTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakTree03_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakTree04_Wall = Game.spritesheet.getSprite(0,0,16,16); 
	public static BufferedImage OakTree05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakTree06_Floor  = Game.spritesheet.getSprite(0,0,16,16); 
	
	// EUCALYPTUS TREE = ARVORE
	public static BufferedImage EucalyptusTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage EucalyptusTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage EucalyptusTree03_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage EucalyptusTree04_Wall = Game.spritesheet.getSprite(0,0,16,16); 
	public static BufferedImage EucalyptusTree05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage EucalyptusTree06_Floor  = Game.spritesheet.getSprite(0,0,16,16); 
		
	// SAKURA TREE = ARVORE DE SAKURA
	public static BufferedImage SakuraTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SakuraTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SakuraTree03_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SakuraTree04_Wall = Game.spritesheet.getSprite(0,0,16,16); 
	public static BufferedImage SakuraTree05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SakuraTree06_Floor  = Game.spritesheet.getSprite(0,0,16,16); 

	// DARK OAK TREE = ARVORE DE CARVALHO ESCURO
	public static BufferedImage OakDarkTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakDarkTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakDarkTree03_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakDarkTree04_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakDarkTree05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage OakDarkTree06_Floor = Game.spritesheet.getSprite(0,0,16,16);

	// PINE TREE = ARVORE DE PINHEIRO
	public static BufferedImage PineTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage PineTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage PineTree03_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage PineTree04_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage PineTree05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage PineTree06_Floor = Game.spritesheet.getSprite(0,0,16,16);
	
	//											SKULL = CRANIO												//
	public static BufferedImage Skull01_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Skull02_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Skull03_Wall = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Skull04_Wall = Game.spritesheet.getSprite(0,0,16,16);

	//											   	SEA = MAR													 	//
	
	// Beach =  PRAIA
	public static BufferedImage Beach01_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach02_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach03_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach04_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage BeachWater_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach06_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach07_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach08_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach09_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach10_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach11_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach12_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Beach13_Floor  = Game.spritesheet.getSprite(0,0,16,16);

	// SEA = MAR
	public static BufferedImage SeaDark01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark03_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark04_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark05_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark06_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark07_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark08_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark09_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark10_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark11_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark12_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaDark13_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaHole_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage SeaRock_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Algae01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Algae02_Wall  = Game.spritesheet.getSprite(0,0,16,16);

	//							CONSTRUCT = CONSTRUÇÃO							 	//
	public static BufferedImage BrickTile_Wall  = Game.spritesheet.getSprite(352,80,16,16);
	public static BufferedImage BrickGoldTile_Wall  = Game.spritesheet.getSprite(352,80,16,16);
	public static BufferedImage Box_Wall  = Game.spritesheet.getSprite(352,80,16,16);
	public static BufferedImage Bonfire_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Chest00_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Chest01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Plate01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Pipe01_Wall  = Game.spritesheet.getSprite(0,0,16,16); 
	
	//	CERCA = FENCE
	public static BufferedImage Fence01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence03_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence04_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence05_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence06_Wall  = Game .spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence07_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence08_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Fence09_Wall  = Game.spritesheet.getSprite(0,0,16,16);

	// 												HOUSE = CASA											//
	
	// CAMP HOUSE = CASA DE ACAMPAMENTO
	public static BufferedImage CampHouse01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse03_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse04_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse05_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse06_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse07_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse08_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse09_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	
	public static BufferedImage CampHouse10_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse11_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse12_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse13_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse14_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage CampHouse15_Floor  = Game.spritesheet.getSprite(0,0,16,16);
 
	// CONNECTIONS HOUSE = CONEXÕES DA CASA  DE ACAMPAMENTO
	public static BufferedImage ConnectionsHouseTree01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree03_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree04_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree05_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree06_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree07_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree08_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree09_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage ConnectionsHouseTree10_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	
	// TENT = TENDA
	public static BufferedImage Tent01_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Tent02_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Tent03_Floor = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage Tent04_Floor = Game.spritesheet.getSprite(0,0,16,16);
	
	// HOUSE MODEL 01 = CASA MODELO 01A
	public static BufferedImage House01A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House02A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House03A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House04A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House05A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House06A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House07A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House08A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House09A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House10A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House11A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House12A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House13A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House14A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House15A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House16A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House17A_Wall  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage House18A_Wall  = Game.spritesheet.getSprite(0,0,16,16);

	// ROADS MODELS = ESTRADAS MODELOS
	
	// MODEL A
	public static BufferedImage RoadModel01A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel02A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel03A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel04A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel05A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel06A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel07A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel08A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel09A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	
	public static BufferedImage RoadModel10A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel11A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel12A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel13A_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	
	// MODEL B
	public static BufferedImage RoadModel01B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel02B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel03B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel04B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel05B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel06B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel07B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel08B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel09B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	
	public static BufferedImage RoadModel10B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel11B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel12B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage RoadModel13B_Floor  = Game.spritesheet.getSprite(0,0,16,16);
	
	// 												MONTAIN = MONTANHA											//
	
	private BufferedImage sprite;
	private int x,y;
	
	public Tile(int x, int y, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, x, y, null);
	}
	
}
