import opencc

# t2s       繁轉簡
# s2t       簡轉繁
# tw2sp     繁體臺灣用語轉簡體大陸用語
# s2twp     簡體大陸用語轉繁體臺灣用語

p = input("請輸入要轉換的內容：")
print(opencc.OpenCC("s2twp").convert(opencc.OpenCC("t2s").convert(p)))
