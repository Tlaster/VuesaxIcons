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

public val BulkGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.27f, 3.35f)
                curveTo(17.8f, 3.28f, 17.26f, 3.25f, 16.5f, 3.25f)
                horizontalLineTo(7.5f)
                curveTo(6.75f, 3.25f, 6.2f, 3.28f, 5.76f, 3.34f)
                curveTo(2.41f, 3.71f, 1.75f, 5.7f, 1.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.75f, 18.3f, 2.41f, 20.29f, 5.73f, 20.65f)
                curveTo(6.2f, 20.72f, 6.74f, 20.75f, 7.5f, 20.75f)
                horizontalLineTo(16.5f)
                curveTo(17.25f, 20.75f, 17.8f, 20.72f, 18.24f, 20.66f)
                curveTo(21.59f, 20.29f, 22.25f, 18.31f, 22.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.25f, 5.7f, 21.59f, 3.71f, 18.27f, 3.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.75f)
                horizontalLineTo(13.5f)
                curveTo(13.09f, 10.75f, 12.75f, 10.41f, 12.75f, 10.0f)
                curveTo(12.75f, 9.59f, 13.09f, 9.25f, 13.5f, 9.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 9.25f, 17.75f, 9.59f, 17.75f, 10.0f)
                curveTo(17.75f, 10.41f, 17.41f, 10.75f, 17.0f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0996f, 11.0f)
                curveTo(9.5496f, 11.0f, 9.0996f, 10.55f, 9.0996f, 10.0f)
                curveTo(9.0996f, 9.45f, 9.5396f, 9.0f, 10.0996f, 9.0f)
                horizontalLineTo(10.1096f)
                curveTo(10.6596f, 9.0f, 11.1096f, 9.45f, 11.1096f, 10.0f)
                curveTo(11.1096f, 10.55f, 10.6596f, 11.0f, 10.0996f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0996f, 11.0f)
                curveTo(6.5496f, 11.0f, 6.0996f, 10.55f, 6.0996f, 10.0f)
                curveTo(6.0996f, 9.45f, 6.5396f, 9.0f, 7.0996f, 9.0f)
                curveTo(7.6496f, 9.0f, 8.0996f, 9.45f, 8.0996f, 10.0f)
                curveTo(8.0996f, 10.55f, 7.6596f, 11.0f, 7.0996f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9998f, 16.25f)
                horizontalLineTo(7.0198f)
                curveTo(6.6098f, 16.25f, 6.2598f, 15.91f, 6.2598f, 15.5f)
                curveTo(6.2598f, 15.09f, 6.5898f, 14.75f, 6.9998f, 14.75f)
                horizontalLineTo(16.9998f)
                curveTo(17.4098f, 14.75f, 17.7498f, 15.09f, 17.7498f, 15.5f)
                curveTo(17.7498f, 15.91f, 17.4098f, 16.25f, 16.9998f, 16.25f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
