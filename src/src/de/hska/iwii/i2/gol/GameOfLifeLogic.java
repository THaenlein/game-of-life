package src.de.hska.iwii.i2.gol;
/**
 * Die eigentliche Spielelogik. Das Spielfeld wird hier nicht
 * als zyklisch geschlossen betrachtet wird.
 *
 * @author Holger Vogelsang
 */
public class GameOfLifeLogic {
	
	/**
	 * Aktuelle Generation bzw. Startgeneration, die ausgegeben wird.
	 */
	private boolean[][] currentGen;
	
	/**
	 * Nächste Generation, die berechnet wird.
	 */
	private boolean[][] nextGen;

	/**
	 * Legt die Startgeneration fest.
	 * @param generation
	 * 			Die im Menü ausgewählte Generation, mit der gestartet werden soll.
	 */
	public void setStartGeneration(boolean[][] generation) 
	{
		this.currentGen = generation.clone();
		this.nextGen = new boolean[this.currentGen.length][this.currentGen[0].length];
	}

	/**
	 * Berechnet die nächste Generation auf Grundlage der aktuellen Generation und legt diese fest.
	 */
	public void nextGeneration() 
    {
        int neighbourCounter = 0;
        this.nextGen = new boolean[this.currentGen.length][this.currentGen[0].length];
        
        for (int y = 0; y < this.currentGen.length; y++)
        {
            for (int x = 0; x < this.currentGen[y].length; x++)
            {
                neighbourCounter = 0;
                
                if (isCellAlive(x-1,y-1)) neighbourCounter++; //links oben
                if (isCellAlive(x,y-1)) neighbourCounter++; //oben
                if (isCellAlive(x+1,y-1)) neighbourCounter++; //rechts oben
                if (isCellAlive(x-1,y)) neighbourCounter++; //links
                if (isCellAlive(x+1,y)) neighbourCounter++; //rechts
                if (isCellAlive(x-1,y+1)) neighbourCounter++; //links unten
                if (isCellAlive(x,y+1)) neighbourCounter++; // unten
                if (isCellAlive(x+1,y+1)) neighbourCounter++; //rechts unten
                
                if (isCellAlive(x,y))
                {
                    if (neighbourCounter == 2 || neighbourCounter == 3) this.nextGen[y][x] = true; //Zelle lebt weiter
                    else if (neighbourCounter > 3) this.nextGen[y][x] = false;  //Zelle stirbt an Überbevölkerung
                    else this.nextGen[y][x] = false; //Zelle stirbt an Vereinsamung
                }
                else
                {
                    if (neighbourCounter == 3) this.nextGen[y][x] = true; //Zelle wird lebendig
                    
                    else this.nextGen[y][x] = false; //Zelle bleibt tot
                }
            }
        }
        this.currentGen = this.nextGen.clone();
    }

	/**
	 * Prüft, ob eine bestimmte Zelle lebt und gibt den entsprechenden Wahrheitswert zurück.
	 * @param x
	 * 			Die x-Koordinate der Zelle in der aktuellen Generation, die geprüft werden soll
	 * @param y
	 * 			Die y-Koordinate der Zelle in der aktuellen Generation, die geprüft werden soll
	 * @return true, wenn die Zelle lebt
	 * false, wenn die Zelle nicht lebt
	 */
	public boolean isCellAlive(int x, int y)
	{
		if ((x>-1) && (y>-1) && (y<this.currentGen.length) && (x<this.currentGen[y].length))
		{
			if (this.currentGen[y][x])
			{
				return true;
			}
		}
		return false;
	}
}