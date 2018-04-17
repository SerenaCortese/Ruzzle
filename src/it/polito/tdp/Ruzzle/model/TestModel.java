package it.polito.tdp.Ruzzle.model;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		
		for(int size=4; size<16; size++) {
			Model m = new Model(size);
			m.reset();//creo Board
			
			long start = System.nanoTime();
			List<String> tutte = m.trovaTutte();
			long stop = System.nanoTime();
			
			System.out.format("Size= %d, trovate %d parole in %d ns\n",size,tutte.size(),(stop-start)/1000000);
		}

	}

}
