class Solution {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        String[] ransomNoteInArr = ransomNote.chars().mapToObj(c -> String.valueOf((char) c)).toArray(String[]::new);
        for (String s : ransomNoteInArr) 
            if (magazine.contains(s))
                magazine = magazine.replaceFirst(s, "");
            else
                return false;
        
        return true;
    }
    
}
