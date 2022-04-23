public class Codec {
    HashMap<String,String> urlShortner=new HashMap<>();
    StringBuilder sb=new StringBuilder();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        sb.append((char)Math.ceil(Math.random()*100));
        
        while(urlShortner.containsKey(sb.toString())){
             sb.append((char)Math.ceil(Math.random()*100));
        }
        urlShortner.put(sb.toString(),longUrl);
        
        return sb.toString();
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlShortner.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));