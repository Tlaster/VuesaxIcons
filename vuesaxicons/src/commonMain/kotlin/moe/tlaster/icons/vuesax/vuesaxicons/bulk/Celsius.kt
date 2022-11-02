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

public val BulkGroup.Celsius: ImageVector
    get() {
        if (_celsius != null) {
            return _celsius!!
        }
        _celsius = Builder(name = "Celsius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0005f, 18.1901f)
                curveTo(8.5906f, 18.1901f, 5.8106f, 15.4101f, 5.8106f, 12.0001f)
                curveTo(5.8106f, 8.5901f, 8.5906f, 5.8101f, 12.0005f, 5.8101f)
                curveTo(13.3505f, 5.8101f, 14.6406f, 6.2401f, 15.7206f, 7.0501f)
                curveTo(16.0506f, 7.3001f, 16.1205f, 7.7701f, 15.8705f, 8.1001f)
                curveTo(15.6205f, 8.4301f, 15.1506f, 8.5001f, 14.8206f, 8.2501f)
                curveTo(14.0006f, 7.6401f, 13.0305f, 7.3101f, 12.0005f, 7.3101f)
                curveTo(9.4206f, 7.3101f, 7.3106f, 9.4101f, 7.3106f, 12.0001f)
                curveTo(7.3106f, 14.5901f, 9.4106f, 16.6901f, 12.0005f, 16.6901f)
                curveTo(13.4805f, 16.6901f, 14.8406f, 16.0101f, 15.7406f, 14.8301f)
                curveTo(15.9906f, 14.5001f, 16.4605f, 14.4401f, 16.7905f, 14.6901f)
                curveTo(17.1205f, 14.9401f, 17.1805f, 15.4101f, 16.9305f, 15.7401f)
                curveTo(15.7505f, 17.2901f, 13.9505f, 18.1901f, 12.0005f, 18.1901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 11.34f)
                curveTo(18.0662f, 11.34f, 18.59f, 10.8162f, 18.59f, 10.17f)
                curveTo(18.59f, 9.5238f, 18.0662f, 9.0f, 17.42f, 9.0f)
                curveTo(16.7738f, 9.0f, 16.25f, 9.5238f, 16.25f, 10.17f)
                curveTo(16.25f, 10.8162f, 16.7738f, 11.34f, 17.42f, 11.34f)
                close()
            }
        }
        .build()
        return _celsius!!
    }

private var _celsius: ImageVector? = null
