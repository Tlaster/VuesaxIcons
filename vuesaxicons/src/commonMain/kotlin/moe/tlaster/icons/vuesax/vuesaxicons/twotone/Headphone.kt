package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Headphone: ImageVector
    get() {
        if (_headphone != null) {
            return _headphone!!
        }
        _headphone = Builder(name = "Headphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4601f, 18.4898f)
                verticalLineTo(15.5698f)
                curveTo(5.4601f, 14.5998f, 6.22f, 13.7298f, 7.3f, 13.7298f)
                curveTo(8.2701f, 13.7298f, 9.14f, 14.4898f, 9.14f, 15.5698f)
                verticalLineTo(18.3798f)
                curveTo(9.14f, 20.3298f, 7.5201f, 21.9498f, 5.57f, 21.9498f)
                curveTo(3.62f, 21.9498f, 2.0001f, 20.3198f, 2.0001f, 18.3798f)
                verticalLineTo(12.2198f)
                curveTo(1.8901f, 6.5998f, 6.33f, 2.0498f, 11.95f, 2.0498f)
                curveTo(17.57f, 2.0498f, 22.0f, 6.5998f, 22.0f, 12.1098f)
                verticalLineTo(18.2698f)
                curveTo(22.0f, 20.2198f, 20.38f, 21.8398f, 18.43f, 21.8398f)
                curveTo(16.48f, 21.8398f, 14.86f, 20.2198f, 14.86f, 18.2698f)
                verticalLineTo(15.4598f)
                curveTo(14.86f, 14.4898f, 15.62f, 13.6198f, 16.7f, 13.6198f)
                curveTo(17.67f, 13.6198f, 18.54f, 14.3798f, 18.54f, 15.4598f)
                verticalLineTo(18.4898f)
            }
        }
        .build()
        return _headphone!!
    }

private var _headphone: ImageVector? = null
