package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Document-text`: ImageVector
    get() {
        if (`_document-text` != null) {
            return `_document-text`!!
        }
        `_document-text` = Builder(name = "Document-text", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(4.5f, 2.0f, 3.0f, 4.0f, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 20.0f, 4.5f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 22.0f, 21.0f, 20.0f, 21.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 4.0f, 19.5f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(8.0f, 12.25f)
                horizontalLineTo(12.0f)
                curveTo(12.41f, 12.25f, 12.75f, 12.59f, 12.75f, 13.0f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 13.75f, 7.25f, 13.41f, 7.25f, 13.0f)
                curveTo(7.25f, 12.59f, 7.59f, 12.25f, 8.0f, 12.25f)
                close()
                moveTo(16.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 17.75f, 7.25f, 17.41f, 7.25f, 17.0f)
                curveTo(7.25f, 16.59f, 7.59f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 16.25f, 16.75f, 16.59f, 16.75f, 17.0f)
                curveTo(16.75f, 17.41f, 16.41f, 17.75f, 16.0f, 17.75f)
                close()
                moveTo(18.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(14.98f, 9.25f, 13.75f, 8.02f, 13.75f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(13.75f, 4.09f, 14.09f, 3.75f, 14.5f, 3.75f)
                curveTo(14.91f, 3.75f, 15.25f, 4.09f, 15.25f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(15.25f, 7.19f, 15.81f, 7.75f, 16.5f, 7.75f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 7.75f, 19.25f, 8.09f, 19.25f, 8.5f)
                curveTo(19.25f, 8.91f, 18.91f, 9.25f, 18.5f, 9.25f)
                close()
            }
        }
        .build()
        return `_document-text`!!
    }

private var `_document-text`: ImageVector? = null
