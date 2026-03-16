# pseudonymize-refactored

<details><summary> Project Initialization Scripts </summary>

### Front
```bash 
pnpm create vite@latest 
> name: front (v)
> Typescript  (v)
```


### Channel
```bash 
curl -L https://start.spring.io/starter.tgz \
  -d type=gradle-project \
  -d language=java \
  -d javaVersion=17 \
  -d groupId=com.pseudonymize \
  -d artifactId=channel \
  -d name=channel \
  -d baseDir=channel \
  -d dependencies=web,validation,security \
  | tar -xzvf -
```


### System
```bash 
curl -L https://start.spring.io/starter.tgz \
  -d type=gradle-project \
  -d language=java \
  -d javaVersion=17 \
  -d groupId=com.pseudonymize \
  -d artifactId=system \
  -d name=system \
  -d baseDir=system \
  -d dependencies=web,data-jpa,postgresql,validation \
  | tar -xzvf -
```

</details> 

## Project Structure 

```
spring-react-starterpack % tree -L 2                                    
.
├── README.md
├── channel
│   ├── Dockerfile-dev
│   ├── HELP.md
│   ├── build.gradle
│   ├── gradle
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
├── front
│   ├── Dockerfile-dev
│   ├── README.md
│   ├── eslint.config.js
│   ├── index.html
│   ├── node_modules
│   ├── package.json
│   ├── pnpm-lock.yaml
│   ├── public
│   ├── src
│   ├── tsconfig.app.json
│   ├── tsconfig.json
│   ├── tsconfig.node.json
│   └── vite.config.ts
└── system
    ├── HELP.md
    ├── build.gradle
    ├── gradle
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle
    └── src

11 directories, 22 files
```

## Start up 
```
spring-react-starterpack % docker compose up --build 
```
