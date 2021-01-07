import os, shutil

scr = "C:\\Users\\DELL\\Desktop\\Django\\cust"
des = "C:\\Users\\DELL\\Desktop\\Django\\cust\\New folder"

for root,dirs,files in os.walk(scr):
    for fil in files:
        if fil.endswith('txt'):
            path_file = os.path.join(root,fil)
            shutil.copy2(path_file,des)
    next
next