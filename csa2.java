93Y649Y9
N.C.

	public static boolean wordChecker(String firstLetter, int maxLength, int n)
	{
		int successN = 0;
		for(int i = 0; i < n; i++){
			String currentWord = getWord();
			if(currentWord.substring(0, 1).equals(firstLetter) && currentWord.legnth() <= maxLength){
				successN++;
			}
		}

		if(successN / n < 0.1){
			return true;
		} else {
			return false;
		}
	}

	
	/*
	To implement this change the programmer could define a global double (percentageTest) = the desired percentage to test for. If desired, a function could be implemented to make percentageTest = the desired testing percentage. You would then substitute "0.1" in the current wordChecker() function with percentageTest. For example, if wanting to test firsLetter = J with percentage P1, followed by testing firstLetter = K with percentage P2, you would call: percentageTest = P1. Then you would call wordChecker() with the desired parameters for the first call. After that you would call: percentageTest = P2. Then you would call wordChecker() with the desired parameters for the second call.
	*/