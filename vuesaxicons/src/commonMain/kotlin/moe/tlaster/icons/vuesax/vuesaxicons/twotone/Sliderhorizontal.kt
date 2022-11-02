package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Sliderhorizontal: ImageVector
    get() {
        if (_sliderhorizontal != null) {
            return _sliderhorizontal!!
        }
        _sliderhorizontal = Builder(name = "Sliderhorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(18.0f, 17.62f, 17.98f, 18.17f, 17.91f, 18.66f)
                curveTo(17.62f, 21.29f, 16.38f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.62f, 22.0f, 6.38f, 21.29f, 6.09f, 18.66f)
                curveTo(6.02f, 18.17f, 6.0f, 17.62f, 6.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 6.38f, 6.02f, 5.83f, 6.09f, 5.34f)
                curveTo(6.38f, 2.71f, 7.62f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.38f, 2.0f, 17.62f, 2.71f, 17.91f, 5.34f)
                curveTo(17.98f, 5.83f, 18.0f, 6.38f, 18.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.0001f)
                curveTo(6.0f, 17.6201f, 6.02f, 18.1701f, 6.09f, 18.6601f)
                curveTo(5.95f, 18.6701f, 5.82f, 18.6701f, 5.67f, 18.6701f)
                horizontalLineTo(5.33f)
                curveTo(2.67f, 18.6701f, 2.0f, 18.0001f, 2.0f, 15.3301f)
                verticalLineTo(8.6701f)
                curveTo(2.0f, 6.0001f, 2.67f, 5.3301f, 5.33f, 5.3301f)
                horizontalLineTo(5.67f)
                curveTo(5.82f, 5.3301f, 5.95f, 5.3301f, 6.09f, 5.3401f)
                curveTo(6.02f, 5.8301f, 6.0f, 6.3801f, 6.0f, 7.0001f)
                verticalLineTo(17.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0002f, 8.6701f)
                verticalLineTo(15.3301f)
                curveTo(22.0002f, 18.0001f, 21.3302f, 18.6701f, 18.6702f, 18.6701f)
                horizontalLineTo(18.3302f)
                curveTo(18.1802f, 18.6701f, 18.0502f, 18.6701f, 17.9102f, 18.6601f)
                curveTo(17.9802f, 18.1701f, 18.0002f, 17.6201f, 18.0002f, 17.0001f)
                verticalLineTo(7.0001f)
                curveTo(18.0002f, 6.3801f, 17.9802f, 5.8301f, 17.9102f, 5.3401f)
                curveTo(18.0502f, 5.3301f, 18.1802f, 5.3301f, 18.3302f, 5.3301f)
                horizontalLineTo(18.6702f)
                curveTo(21.3302f, 5.3301f, 22.0002f, 6.0001f, 22.0002f, 8.6701f)
                close()
            }
        }
        .build()
        return _sliderhorizontal!!
    }

private var _sliderhorizontal: ImageVector? = null
