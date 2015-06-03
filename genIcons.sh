sizes="ldpi:36 mdpi:48 hdpi:72 xhdpi:96 xxhdpi:144 xxxhdpi:192"
filename="mf_icon_final"

for size in $sizes; do
    dir=$(echo "$size" | cut -d ':' -f 1)
    px=$(echo "$size" | cut -d ':' -f 2)

    target="app/src/main/res/drawable-$dir"
    mkdir -p "$target"

    convert app/src/main/res/drawable/"$filename".png -resize "${px}x${px}" "$target"/"$filename".png
done
