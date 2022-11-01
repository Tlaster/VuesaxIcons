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

public val BulkGroup.Theta: ImageVector
    get() {
        if (_theta != null) {
            return _theta!!
        }
        _theta = Builder(name = "Theta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.82f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.82f, 4.17f, 21.99f, 7.81f, 21.99f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 21.99f, 21.99f, 19.82f, 21.99f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.15f, 6.0f)
                horizontalLineTo(8.85f)
                curveTo(7.83f, 6.0f, 7.0f, 6.83f, 7.0f, 7.85f)
                verticalLineTo(16.15f)
                curveTo(7.0f, 17.17f, 7.83f, 18.0f, 8.85f, 18.0f)
                horizontalLineTo(15.15f)
                curveTo(16.17f, 18.0f, 17.0f, 17.17f, 17.0f, 16.15f)
                verticalLineTo(7.85f)
                curveTo(17.0f, 6.83f, 16.17f, 6.0f, 15.15f, 6.0f)
                close()
                moveTo(14.0f, 14.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12.0f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(14.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 14.25f, 9.25f, 13.91f, 9.25f, 13.5f)
                curveTo(9.25f, 13.09f, 9.59f, 12.75f, 10.0f, 12.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 12.75f, 14.75f, 13.09f, 14.75f, 13.5f)
                curveTo(14.75f, 13.91f, 14.41f, 14.25f, 14.0f, 14.25f)
                close()
                moveTo(14.0f, 11.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 11.25f, 9.25f, 10.91f, 9.25f, 10.5f)
                curveTo(9.25f, 10.09f, 9.59f, 9.75f, 10.0f, 9.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12.0f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 9.75f, 14.75f, 10.09f, 14.75f, 10.5f)
                curveTo(14.75f, 10.91f, 14.41f, 11.25f, 14.0f, 11.25f)
                close()
            }
        }
        .build()
        return _theta!!
    }

private var _theta: ImageVector? = null
