# JavaImageSave
[日本語](README.md)

This program can automatically save the results of so-net image search, which gives almost the same results as google image search in java.
Use at your own risk
## how to use

```bash
JavaSaveImage.bat -t search_text -l count_of_search(default 5) -p path_to_save
```

```bash
JavaSaveImage.bat -t search_text -o search_option
```

```bash
JavaSaveImage.bat -t search_text -r 90
```



Auto start search and auto convert 96 dpi jpeg image. If get image is height > width , rotate it 90°.

## option

-l option is search count

one count 20 image

-t option is search word. If it word has space,please use double quotation.

-p option is set save path.

-h option is help. print help message.

-o option is set option for search engin.

-r option is set rotate degree. use this option, It will not auto rotate.

https://www.so-net.ne.jp/search/image/?count=20&query= (-t option word) (-o option strings)&start=(count of search*20)

ex) tlanguage,ysp_q,size,end,imtype,format,ss_view,from,q_type,view,adult,start,size_all

## Search using the -o option

### Specifying the extension when searching

You can specify the extension when searching.(only jpeg,gif,png)

The extension is specified at the time of search and is converted to jpeg at the time of saving.

```bash
JavaSaveImage.bat -t text -o "&format=png"
```

### get adult image

You can also get adult images.

```bash
JavaSaveImage.bat -t text -o "&adult=on"
```

### set image size

Can be specified multiple times, but use size_all option.

```bash
JavaSaveImage.bat -t text -o "&size=large"
```
```bash
JavaSaveImage.bat -t text -o "&size=small"
```

```bash
JavaSaveImage.bat -t text -o "&size=medium"
```

```bash
JavaSaveImage.bat -t text -o "&size_all=parts&size=small&size=medium"
```



### set search type

```bash
JavaSaveImage.bat -t text -o "&q_type=and_w"
```

```bash
JavaSaveImage.bat -t text -o "&q_type=or_w"
```

```bash
JavaSaveImage.bat -t text -o "&q_type=ph_w"
```

### image color

```bash
JavaSaveImage.bat -t text -o "&imtype=gray"
```

```bash
JavaSaveImage.bat -t text -o "&imtype=color"
```
