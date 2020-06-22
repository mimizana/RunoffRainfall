"# Runoff rain fall" 
Begin 
     Get footprint of the roof:
       Dimension1
       Dimension2

      ///Convert dimension to inches
         dimension1Inch =dimension1 *12
         dimension2InchD =dimension2 *12
		 
      //Multiply roof dimension by rainfall
         
			numberOFInches =dimension1Inch * dimension2Inch *1;
			
       
	   //Calculate amount of water gallons runs of the roof:
	   waterRun = numberOFInches/231;


        Result: Amount of water runs off a roof in a rain storm equals:"+ waterRun

       End
     test data 1:

			40'
			20'
			Footprint inches: 
			480"
			240"
			dimension by rainfall: 115,200
			Result: 498.7

			test data2

			60'
			40'

			Footprint inches:
			720"
			480"
			dimension by rainfall: 345,600

			Result: 1,496.1





