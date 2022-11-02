package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12.0f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12.0f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6009f, 22.5601f)
                horizontalLineTo(6.4009f)
                curveTo(4.5809f, 22.5601f, 2.9209f, 21.1601f, 2.6209f, 19.3701f)
                lineTo(1.2909f, 11.4001f)
                curveTo(1.0709f, 10.1601f, 1.6809f, 8.5701f, 2.6709f, 7.7801f)
                lineTo(9.6009f, 2.2301f)
                curveTo(10.9409f, 1.1501f, 13.0509f, 1.1601f, 14.4009f, 2.2401f)
                lineTo(21.3309f, 7.7801f)
                curveTo(22.3109f, 8.5701f, 22.9109f, 10.1601f, 22.7109f, 11.4001f)
                lineTo(21.3809f, 19.3601f)
                curveTo(21.0809f, 21.1301f, 19.3809f, 22.5601f, 17.6009f, 22.5601f)
                close()
                moveTo(11.9909f, 2.9301f)
                curveTo(11.4609f, 2.9301f, 10.9309f, 3.0901f, 10.5409f, 3.4001f)
                lineTo(3.6109f, 8.9601f)
                curveTo(3.0509f, 9.4101f, 2.6509f, 10.4501f, 2.7709f, 11.1601f)
                lineTo(4.1009f, 19.1201f)
                curveTo(4.2809f, 20.1701f, 5.3309f, 21.0601f, 6.4009f, 21.0601f)
                horizontalLineTo(17.6009f)
                curveTo(18.6709f, 21.0601f, 19.7209f, 20.1701f, 19.9009f, 19.1101f)
                lineTo(21.2309f, 11.1501f)
                curveTo(21.3409f, 10.4501f, 20.9409f, 9.3901f, 20.3909f, 8.9501f)
                lineTo(13.4609f, 3.4101f)
                curveTo(13.0609f, 3.0901f, 12.5209f, 2.9301f, 11.9909f, 2.9301f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
