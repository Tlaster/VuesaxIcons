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

public val BrokenGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9609f, 6.1699f)
                curveTo(18.9609f, 7.5599f, 20.3409f, 9.7699f, 20.6209f, 12.3199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4902f, 12.37f)
                curveTo(3.7502f, 9.83f, 5.1102f, 7.62f, 7.0902f, 6.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1895f, 20.9399f)
                curveTo(9.3495f, 21.5299f, 10.6695f, 21.8599f, 12.0595f, 21.8599f)
                curveTo(13.3995f, 21.8599f, 14.6595f, 21.5599f, 15.7895f, 21.0099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2793f, 4.9199f)
                curveTo(9.2793f, 6.4499f, 10.5193f, 7.6999f, 12.0593f, 7.6999f)
                curveTo(13.5993f, 7.6999f, 14.8393f, 6.4599f, 14.8393f, 4.9199f)
                curveTo(14.8393f, 3.3799f, 13.5993f, 2.1399f, 12.0593f, 2.1399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.8308f, 19.9201f)
                curveTo(6.3661f, 19.9201f, 7.6108f, 18.6755f, 7.6108f, 17.1401f)
                curveTo(7.6108f, 15.6048f, 6.3661f, 14.3601f, 4.8308f, 14.3601f)
                curveTo(3.2954f, 14.3601f, 2.0508f, 15.6048f, 2.0508f, 17.1401f)
                curveTo(2.0508f, 18.6755f, 3.2954f, 19.9201f, 4.8308f, 19.9201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9409f, 17.1401f)
                curveTo(21.9409f, 15.6101f, 20.7009f, 14.3601f, 19.1609f, 14.3601f)
                curveTo(17.6209f, 14.3601f, 16.3809f, 15.6001f, 16.3809f, 17.1401f)
                curveTo(16.3809f, 18.6801f, 17.6209f, 19.9201f, 19.1609f, 19.9201f)
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
