let $database := "people"
for $name in file:list('.', false(), '*.txt')
let $file := file:read-text($name)
let $text := json:parse($file)
return db:add($database, $text, $name) 
