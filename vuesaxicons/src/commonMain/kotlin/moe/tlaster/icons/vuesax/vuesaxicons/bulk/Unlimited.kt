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

public val BulkGroup.Unlimited: ImageVector
    get() {
        if (_unlimited != null) {
            return _unlimited!!
        }
        _unlimited = Builder(name = "Unlimited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.4503f, 17.2999f)
                curveTo(15.7703f, 17.2999f, 14.2202f, 16.5099f, 13.2102f, 15.1199f)
                curveTo(12.9702f, 14.7899f, 13.0402f, 14.3199f, 13.3702f, 14.0699f)
                curveTo(13.7002f, 13.8199f, 14.1703f, 13.8999f, 14.4203f, 14.2299f)
                curveTo(15.1503f, 15.2199f, 16.2503f, 15.7899f, 17.4503f, 15.7899f)
                curveTo(19.5403f, 15.7899f, 21.2502f, 14.0899f, 21.2502f, 11.9899f)
                curveTo(21.2502f, 9.8899f, 19.5503f, 8.1899f, 17.4503f, 8.1899f)
                curveTo(16.0303f, 8.1899f, 14.6902f, 8.9499f, 13.9602f, 10.1599f)
                lineTo(11.3102f, 14.5699f)
                curveTo(10.3102f, 16.2399f, 8.4803f, 17.2699f, 6.5402f, 17.2699f)
                curveTo(3.6202f, 17.2699f, 1.2402f, 14.8899f, 1.2402f, 11.9699f)
                curveTo(1.2402f, 9.0499f, 3.6202f, 6.6699f, 6.5402f, 6.6699f)
                curveTo(8.2203f, 6.6699f, 9.7702f, 7.4599f, 10.7802f, 8.8499f)
                curveTo(11.0202f, 9.1799f, 10.9502f, 9.6499f, 10.6202f, 9.8999f)
                curveTo(10.2802f, 10.1499f, 9.8202f, 10.0699f, 9.5702f, 9.7399f)
                curveTo(8.8403f, 8.7499f, 7.7403f, 8.1799f, 6.5402f, 8.1799f)
                curveTo(4.4503f, 8.1799f, 2.7402f, 9.8799f, 2.7402f, 11.9799f)
                curveTo(2.7402f, 14.0799f, 4.4402f, 15.7799f, 6.5402f, 15.7799f)
                curveTo(7.9602f, 15.7799f, 9.3002f, 15.0199f, 10.0302f, 13.8099f)
                lineTo(12.6802f, 9.3999f)
                curveTo(13.6802f, 7.7299f, 15.5103f, 6.6999f, 17.4503f, 6.6999f)
                curveTo(20.3703f, 6.6999f, 22.7502f, 9.0799f, 22.7502f, 11.9999f)
                curveTo(22.7502f, 14.9199f, 20.3703f, 17.2999f, 17.4503f, 17.2999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 14.0f)
                curveTo(7.6046f, 14.0f, 8.5f, 13.1046f, 8.5f, 12.0f)
                curveTo(8.5f, 10.8954f, 7.6046f, 10.0f, 6.5f, 10.0f)
                curveTo(5.3954f, 10.0f, 4.5f, 10.8954f, 4.5f, 12.0f)
                curveTo(4.5f, 13.1046f, 5.3954f, 14.0f, 6.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.0f)
                curveTo(18.6046f, 14.0f, 19.5f, 13.1046f, 19.5f, 12.0f)
                curveTo(19.5f, 10.8954f, 18.6046f, 10.0f, 17.5f, 10.0f)
                curveTo(16.3954f, 10.0f, 15.5f, 10.8954f, 15.5f, 12.0f)
                curveTo(15.5f, 13.1046f, 16.3954f, 14.0f, 17.5f, 14.0f)
                close()
            }
        }
        .build()
        return _unlimited!!
    }

private var _unlimited: ImageVector? = null
