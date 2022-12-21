import sys
import os
import comtypes.client

filename = ["EEIT_第二次期中專題"]

for i in filename:
    #設置路徑
    input_file_path = i + ".pptx"
    output_file_path = i + ".pdf"
    #創建PDF
    powerpoint = comtypes.client.CreateObject("Powerpoint.Application")
    powerpoint.Visible = True
    slides = powerpoint.Presentations.Open(os.path.abspath(input_file_path))
    #保存PDF
    slides.SaveAs(os.path.abspath(output_file_path), 32)
    slides.Close()
    print("成功匯出PDF檔：" + i + ".pdf")