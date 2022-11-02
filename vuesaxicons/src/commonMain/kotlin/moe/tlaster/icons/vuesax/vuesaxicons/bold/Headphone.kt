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

public val BoldGroup.Headphone: ImageVector
    get() {
        if (_headphone != null) {
            return _headphone!!
        }
        _headphone = Builder(name = "Headphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7498f, 18.6508f)
                curveTo(2.3398f, 18.6508f, 1.9998f, 18.3108f, 1.9998f, 17.9008f)
                verticalLineTo(12.2008f)
                curveTo(1.9498f, 9.4908f, 2.9598f, 6.9308f, 4.8398f, 5.0108f)
                curveTo(6.7198f, 3.1008f, 9.2398f, 2.0508f, 11.9498f, 2.0508f)
                curveTo(17.4898f, 2.0508f, 21.9998f, 6.5608f, 21.9998f, 12.1008f)
                verticalLineTo(17.8008f)
                curveTo(21.9998f, 18.2108f, 21.6598f, 18.5508f, 21.2498f, 18.5508f)
                curveTo(20.8398f, 18.5508f, 20.4998f, 18.2108f, 20.4998f, 17.8008f)
                verticalLineTo(12.1008f)
                curveTo(20.4998f, 7.3908f, 16.6698f, 3.5508f, 11.9498f, 3.5508f)
                curveTo(9.6398f, 3.5508f, 7.4998f, 4.4408f, 5.9098f, 6.0608f)
                curveTo(4.3098f, 7.6908f, 3.4598f, 9.8608f, 3.4998f, 12.1808f)
                verticalLineTo(17.8908f)
                curveTo(3.4998f, 18.3108f, 3.1698f, 18.6508f, 2.7498f, 18.6508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.94f, 12.4492f)
                horizontalLineTo(5.81f)
                curveTo(3.71f, 12.4492f, 2.0f, 14.1592f, 2.0f, 16.2592f)
                verticalLineTo(18.1392f)
                curveTo(2.0f, 20.2392f, 3.71f, 21.9492f, 5.81f, 21.9492f)
                horizontalLineTo(5.94f)
                curveTo(8.04f, 21.9492f, 9.75f, 20.2392f, 9.75f, 18.1392f)
                verticalLineTo(16.2592f)
                curveTo(9.75f, 14.1592f, 8.04f, 12.4492f, 5.94f, 12.4492f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.19f, 12.4492f)
                horizontalLineTo(18.06f)
                curveTo(15.96f, 12.4492f, 14.25f, 14.1592f, 14.25f, 16.2592f)
                verticalLineTo(18.1392f)
                curveTo(14.25f, 20.2392f, 15.96f, 21.9492f, 18.06f, 21.9492f)
                horizontalLineTo(18.19f)
                curveTo(20.29f, 21.9492f, 22.0f, 20.2392f, 22.0f, 18.1392f)
                verticalLineTo(16.2592f)
                curveTo(22.0f, 14.1592f, 20.29f, 12.4492f, 18.19f, 12.4492f)
                close()
            }
        }
        .build()
        return _headphone!!
    }

private var _headphone: ImageVector? = null
