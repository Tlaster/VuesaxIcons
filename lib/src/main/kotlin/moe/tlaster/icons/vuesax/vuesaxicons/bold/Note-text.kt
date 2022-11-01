package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Note-text`: ImageVector
    get() {
        if (`_note-text` != null) {
            return `_note-text`!!
        }
        `_note-text` = Builder(name = "Note-text", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 3.5f)
                verticalLineTo(2.0f)
                curveTo(8.75f, 1.59f, 8.41f, 1.25f, 8.0f, 1.25f)
                curveTo(7.59f, 1.25f, 7.25f, 1.59f, 7.25f, 2.0f)
                verticalLineTo(3.56f)
                curveTo(7.5f, 3.53f, 7.73f, 3.5f, 8.0f, 3.5f)
                horizontalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(2.0f)
                curveTo(16.75f, 1.59f, 16.41f, 1.25f, 16.0f, 1.25f)
                curveTo(15.59f, 1.25f, 15.25f, 1.59f, 15.25f, 2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(16.0f)
                curveTo(16.27f, 3.5f, 16.5f, 3.53f, 16.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(5.0f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16.0f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(5.0f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8.0f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5.0f)
                verticalLineTo(3.56f)
                curveTo(4.3f, 3.83f, 3.0f, 5.73f, 3.0f, 8.5f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 20.0f, 4.5f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 22.0f, 21.0f, 20.0f, 21.0f, 17.0f)
                verticalLineTo(8.5f)
                curveTo(21.0f, 5.73f, 19.7f, 3.83f, 16.75f, 3.56f)
                close()
                moveTo(12.0f, 16.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16.0f)
                curveTo(7.25f, 15.59f, 7.59f, 15.25f, 8.0f, 15.25f)
                horizontalLineTo(12.0f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16.0f)
                curveTo(12.75f, 16.41f, 12.41f, 16.75f, 12.0f, 16.75f)
                close()
                moveTo(16.0f, 11.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 11.75f, 7.25f, 11.41f, 7.25f, 11.0f)
                curveTo(7.25f, 10.59f, 7.59f, 10.25f, 8.0f, 10.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 10.25f, 16.75f, 10.59f, 16.75f, 11.0f)
                curveTo(16.75f, 11.41f, 16.41f, 11.75f, 16.0f, 11.75f)
                close()
            }
        }
        .build()
        return `_note-text`!!
    }

private var `_note-text`: ImageVector? = null
