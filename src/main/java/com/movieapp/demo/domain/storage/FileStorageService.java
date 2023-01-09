package com.movieapp.demo.domain.storage;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * <h1>@Service FileStorageService</h1>
 * The MovieRepository program implements an MovieService Class
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Krzysztof Ksiazek
 * @author  Daniel Sikora
 * @author  Adrian Ciochon
 * @version 1.0
 * @since   2022-11-04
 */
@Service
public class FileStorageService {
    private final String fileStorageLocation;
    private final String imageStorageLocation;

    /**
     * Constructor FileStorageService service
     * @param fileStorageLocation fileStorageLocation
     * @throws FileNotFoundException
     */
    public FileStorageService(@Value("${app.storage.location}") String fileStorageLocation) throws FileNotFoundException {
        this.fileStorageLocation = fileStorageLocation;
        this.imageStorageLocation = fileStorageLocation + "/img/";
        Path fileStoragePath = Path.of(fileStorageLocation);
        checkDirectoryExists(fileStoragePath);
        Path imageStoragePath = Path.of(imageStorageLocation);
        checkDirectoryExists(imageStoragePath);
    }

    /**
     * checkDirectoryExists method
     * @param path path
     * @throws FileNotFoundException
     */
    private void checkDirectoryExists(Path path) throws FileNotFoundException {
        if (Files.notExists(path)) {
            throw new FileNotFoundException("Directory %s does not exist.".formatted(path.toString()));
        }
    }

    /**
     * saveImage method
     * @param file file
     * @return String
     */
    public String saveImage(MultipartFile file) {
        return saveFile(file, imageStorageLocation);
    }

    /**
     * saveFile method
     * @param file file
     * @return String
     */
    public String saveFile(MultipartFile file) {
        return saveFile(file, fileStorageLocation);
    }

    /**
     * saveFile 2 @param method
     * @param file file
     * @param storageLocation storageLocation
     * @return String
     */
    private String saveFile(MultipartFile file, String storageLocation) {
        Path filePath = createFilePath(file, storageLocation);
        try {
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            return filePath.getFileName().toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * createFilePath method
     * @param file file
     * @param storageLocation storageLocation
     * @return
     */
    private Path createFilePath(MultipartFile file, String storageLocation) {
        String originalFileName = file.getOriginalFilename();
        String fileBaseName = FilenameUtils.getBaseName(originalFileName);
        String fileExtension = FilenameUtils.getExtension(originalFileName);
        String completeFilename;
        Path filePath;
        int fileIndex = 0;
        do {
            completeFilename = fileBaseName + fileIndex + "." + fileExtension;
            filePath = Paths.get(storageLocation, completeFilename);
            fileIndex++;
        } while (Files.exists(filePath));
        return filePath;
    }
}