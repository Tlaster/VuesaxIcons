package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Linksquare: ImageVector
    get() {
        if (_linksquare != null) {
            return _linksquare!!
        }
        _linksquare = Builder(name = "Linksquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1801f, 16.0199f)
                curveTo(7.4201f, 15.9499f, 6.6701f, 15.5999f, 6.0901f, 14.9899f)
                curveTo(4.7701f, 13.5999f, 4.7701f, 11.3199f, 6.0901f, 9.9299f)
                lineTo(8.2801f, 7.6299f)
                curveTo(9.6001f, 6.2399f, 11.7701f, 6.2399f, 13.1001f, 7.6299f)
                curveTo(14.4201f, 9.0199f, 14.4201f, 11.2999f, 13.1001f, 12.6899f)
                lineTo(12.0101f, 13.8399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8202f, 7.98f)
                curveTo(16.5802f, 8.05f, 17.3302f, 8.4f, 17.9102f, 9.01f)
                curveTo(19.2302f, 10.4f, 19.2302f, 12.68f, 17.9102f, 14.07f)
                lineTo(15.7202f, 16.37f)
                curveTo(14.4002f, 17.76f, 12.2302f, 17.76f, 10.9002f, 16.37f)
                curveTo(9.5802f, 14.98f, 9.5802f, 12.7f, 10.9002f, 11.31f)
                lineTo(11.9902f, 10.16f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return _linksquare!!
    }

private var _linksquare: ImageVector? = null
