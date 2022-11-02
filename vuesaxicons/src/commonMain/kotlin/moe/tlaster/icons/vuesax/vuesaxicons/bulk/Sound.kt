package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Sound: ImageVector
    get() {
        if (_sound != null) {
            return _sound!!
        }
        _sound = Builder(name = "Sound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.5f)
                curveTo(2.59f, 16.5f, 2.25f, 16.16f, 2.25f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(2.25f, 7.84f, 2.59f, 7.5f, 3.0f, 7.5f)
                curveTo(3.41f, 7.5f, 3.75f, 7.84f, 3.75f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(3.75f, 16.16f, 3.41f, 16.5f, 3.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 19.0f)
                curveTo(7.09f, 19.0f, 6.75f, 18.66f, 6.75f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(6.75f, 5.34f, 7.09f, 5.0f, 7.5f, 5.0f)
                curveTo(7.91f, 5.0f, 8.25f, 5.34f, 8.25f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(8.25f, 18.66f, 7.91f, 19.0f, 7.5f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.5f)
                curveTo(11.59f, 21.5f, 11.25f, 21.16f, 11.25f, 20.75f)
                verticalLineTo(3.25f)
                curveTo(11.25f, 2.84f, 11.59f, 2.5f, 12.0f, 2.5f)
                curveTo(12.41f, 2.5f, 12.75f, 2.84f, 12.75f, 3.25f)
                verticalLineTo(20.75f)
                curveTo(12.75f, 21.16f, 12.41f, 21.5f, 12.0f, 21.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 19.0f)
                curveTo(16.09f, 19.0f, 15.75f, 18.66f, 15.75f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(15.75f, 5.34f, 16.09f, 5.0f, 16.5f, 5.0f)
                curveTo(16.91f, 5.0f, 17.25f, 5.34f, 17.25f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(17.25f, 18.66f, 16.91f, 19.0f, 16.5f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.5f)
                curveTo(20.59f, 16.5f, 20.25f, 16.16f, 20.25f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(20.25f, 7.84f, 20.59f, 7.5f, 21.0f, 7.5f)
                curveTo(21.41f, 7.5f, 21.75f, 7.84f, 21.75f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(21.75f, 16.16f, 21.41f, 16.5f, 21.0f, 16.5f)
                close()
            }
        }
        .build()
        return _sound!!
    }

private var _sound: ImageVector? = null
