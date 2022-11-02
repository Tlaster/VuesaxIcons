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

public val OutlineGroup.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }
        _logout = Builder(name = "Logout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2405f, 22.27f)
                horizontalLineTo(15.1105f)
                curveTo(10.6705f, 22.27f, 8.5305f, 20.52f, 8.1605f, 16.6f)
                curveTo(8.1205f, 16.19f, 8.4205f, 15.82f, 8.8405f, 15.78f)
                curveTo(9.2405f, 15.74f, 9.6205f, 16.05f, 9.6605f, 16.46f)
                curveTo(9.9505f, 19.6f, 11.4305f, 20.77f, 15.1205f, 20.77f)
                horizontalLineTo(15.2505f)
                curveTo(19.3205f, 20.77f, 20.7605f, 19.33f, 20.7605f, 15.26f)
                verticalLineTo(8.74f)
                curveTo(20.7605f, 4.67f, 19.3205f, 3.23f, 15.2505f, 3.23f)
                horizontalLineTo(15.1205f)
                curveTo(11.4105f, 3.23f, 9.9305f, 4.42f, 9.6605f, 7.62f)
                curveTo(9.6105f, 8.03f, 9.2605f, 8.34f, 8.8405f, 8.3f)
                curveTo(8.4205f, 8.27f, 8.1205f, 7.9f, 8.1505f, 7.49f)
                curveTo(8.4905f, 3.51f, 10.6405f, 1.73f, 15.1105f, 1.73f)
                horizontalLineTo(15.2405f)
                curveTo(20.1505f, 1.73f, 22.2505f, 3.83f, 22.2505f, 8.74f)
                verticalLineTo(15.26f)
                curveTo(22.2505f, 20.17f, 20.1505f, 22.27f, 15.2405f, 22.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9991f, 12.75f)
                horizontalLineTo(3.6191f)
                curveTo(3.2091f, 12.75f, 2.8691f, 12.41f, 2.8691f, 12.0f)
                curveTo(2.8691f, 11.59f, 3.2091f, 11.25f, 3.6191f, 11.25f)
                horizontalLineTo(14.9991f)
                curveTo(15.4091f, 11.25f, 15.7491f, 11.59f, 15.7491f, 12.0f)
                curveTo(15.7491f, 12.41f, 15.4091f, 12.75f, 14.9991f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8495f, 16.1001f)
                curveTo(5.6595f, 16.1001f, 5.4694f, 16.0301f, 5.3194f, 15.8801f)
                lineTo(1.9694f, 12.5301f)
                curveTo(1.6795f, 12.2401f, 1.6795f, 11.7601f, 1.9694f, 11.4701f)
                lineTo(5.3194f, 8.1201f)
                curveTo(5.6094f, 7.8301f, 6.0894f, 7.8301f, 6.3794f, 8.1201f)
                curveTo(6.6694f, 8.4101f, 6.6694f, 8.8901f, 6.3794f, 9.1801f)
                lineTo(3.5594f, 12.0001f)
                lineTo(6.3794f, 14.8201f)
                curveTo(6.6694f, 15.1101f, 6.6694f, 15.5901f, 6.3794f, 15.8801f)
                curveTo(6.2394f, 16.0301f, 6.0395f, 16.1001f, 5.8495f, 16.1001f)
                close()
            }
        }
        .build()
        return _logout!!
    }

private var _logout: ImageVector? = null
