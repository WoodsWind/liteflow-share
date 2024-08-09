package com.zyhl.yun.liteflow.conventor;

import com.zyhl.yun.liteflow.domain.entity.FileEntity;
import com.zyhl.yun.liteflow.domain.entity.SimpleFileInfo;
import com.zyhl.yun.liteflow.domain.entity.SimpleFileInfo.SimpleFileInfoBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class FileEntityConvertor {
    private SimpleFileInfo simpleFileInfo;

    public SimpleFileInfo toSimpleFileEntity(FileEntity fileEntity) {
        if ( fileEntity == null ) {
            return null;
        }
        SimpleFileInfoBuilder simpleFileInfo = SimpleFileInfo.builder();
        simpleFileInfo.fileId(fileEntity.getFileId() )
                .name( fileEntity.getName() )
                .parentFileId( fileEntity.getParentFileId() )
                .type( fileEntity.getType() );
        return simpleFileInfo.build();
    }
}
