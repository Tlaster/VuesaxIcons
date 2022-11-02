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

public val BulkGroup.Sliderhorizontal: ImageVector
    get() {
        if (_sliderhorizontal != null) {
            return _sliderhorizontal!!
        }
        _sliderhorizontal = Builder(name = "Sliderhorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 5.0601f)
                verticalLineTo(18.9401f)
                curveTo(3.5f, 19.3501f, 3.16f, 19.6901f, 2.75f, 19.6901f)
                curveTo(2.34f, 19.6901f, 2.0f, 19.3501f, 2.0f, 18.9401f)
                verticalLineTo(5.0601f)
                curveTo(2.0f, 4.6501f, 2.34f, 4.3101f, 2.75f, 4.3101f)
                curveTo(3.16f, 4.3101f, 3.5f, 4.6501f, 3.5f, 5.0601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0601f)
                verticalLineTo(18.9401f)
                curveTo(22.0f, 19.3501f, 21.66f, 19.6901f, 21.25f, 19.6901f)
                curveTo(20.84f, 19.6901f, 20.5f, 19.3501f, 20.5f, 18.9401f)
                verticalLineTo(5.0601f)
                curveTo(20.5f, 4.6501f, 20.84f, 4.3101f, 21.25f, 4.3101f)
                curveTo(21.66f, 4.3101f, 22.0f, 4.6501f, 22.0f, 5.0601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5996f, 21.25f)
                horizontalLineTo(16.3996f)
                curveTo(18.0596f, 21.25f, 19.3996f, 19.91f, 19.3996f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.3996f, 4.09f, 18.0596f, 2.75f, 16.3996f, 2.75f)
                horizontalLineTo(7.5996f)
                curveTo(5.9396f, 2.75f, 4.5996f, 4.09f, 4.5996f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5996f, 19.91f, 5.9396f, 21.25f, 7.5996f, 21.25f)
                close()
            }
        }
        .build()
        return _sliderhorizontal!!
    }

private var _sliderhorizontal: ImageVector? = null
