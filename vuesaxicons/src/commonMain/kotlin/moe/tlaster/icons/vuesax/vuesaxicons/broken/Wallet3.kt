package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Wallet3: ImageVector
    get() {
        if (_wallet3 != null) {
            return _wallet3!!
        }
        _wallet3 = Builder(name = "Wallet3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 11.1499f)
                horizontalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.3105f, 2.8501f)
                curveTo(13.3505f, 2.8501f, 15.0005f, 4.1201f, 15.0005f, 6.1601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.1501f)
                verticalLineTo(6.5301f)
                curveTo(2.0f, 4.4901f, 3.65f, 2.8401f, 5.69f, 2.8401f)
                horizontalLineTo(7.62f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.1499f)
                curveTo(2.0f, 7.9399f, 3.79f, 6.1499f, 6.0f, 6.1499f)
                horizontalLineTo(16.0f)
                curveTo(18.2f, 6.1499f, 20.0f, 7.9499f, 20.0f, 10.1499f)
                verticalLineTo(11.5999f)
                horizontalLineTo(18.92f)
                curveTo(18.36f, 11.5999f, 17.85f, 11.8199f, 17.48f, 12.1999f)
                curveTo(16.98f, 12.6799f, 16.74f, 13.4199f, 16.94f, 14.1799f)
                curveTo(17.19f, 15.1099f, 18.11f, 15.6999f, 19.07f, 15.6999f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.1499f)
                curveTo(20.0f, 19.3599f, 18.21f, 21.1499f, 16.0f, 21.1499f)
                horizontalLineTo(6.0f)
                curveTo(3.79f, 21.1499f, 2.0f, 19.3599f, 2.0f, 17.1499f)
                verticalLineTo(14.5199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0002f, 12.6201f)
                verticalLineTo(14.6801f)
                curveTo(22.0002f, 15.2401f, 21.5402f, 15.7001f, 20.9702f, 15.7001f)
                horizontalLineTo(19.0402f)
                curveTo(17.9602f, 15.7001f, 16.9702f, 14.9101f, 16.8802f, 13.8301f)
                curveTo(16.8202f, 13.2001f, 17.0602f, 12.6101f, 17.4802f, 12.2001f)
                curveTo(17.8502f, 11.8201f, 18.3602f, 11.6001f, 18.9202f, 11.6001f)
                horizontalLineTo(20.9702f)
                curveTo(21.5402f, 11.6001f, 22.0002f, 12.0601f, 22.0002f, 12.6201f)
                close()
            }
        }
        .build()
        return _wallet3!!
    }

private var _wallet3: ImageVector? = null
