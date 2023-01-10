public class ArrayAlgorithms {

    // ADD THE FOLLOWING THREE METHODS TO THE OTHER TEN IN THIS CLASS!

    /** Returns the length of the longest String(s) in an array of Strings.
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  length of the longest String in the array
     */
    public static int longestString(String[] stringList) {
        String longestIndex = stringList[0];
        int longest = 0;
        for (String word : stringList) {
            if (word.length() > longestIndex.length()) {
                longest = word.length();
            } else {
                longest = longestIndex.length();
            }
        }
        return longest;
    }


    /** Changes all words in an array of words to uppercase.
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }




    }
