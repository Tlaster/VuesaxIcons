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

public val OutlineGroup.Login: ImageVector
    get() {
        if (_login != null) {
            return _login!!
        }
        _login = Builder(name = "Login", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2405f, 22.27f)
                horizontalLineTo(15.1105f)
                curveTo(10.6705f, 22.27f, 8.5305f, 20.52f, 8.1605f, 16.6f)
                curveTo(8.1205f, 16.19f, 8.4205f, 15.82f, 8.8405f, 15.78f)
                curveTo(9.2505f, 15.74f, 9.6205f, 16.05f, 9.6605f, 16.46f)
                curveTo(9.9505f, 19.6f, 11.4305f, 20.77f, 15.1205f, 20.77f)
                horizontalLineTo(15.2505f)
                curveTo(19.3205f, 20.77f, 20.7605f, 19.33f, 20.7605f, 15.26f)
                verticalLineTo(8.74f)
                curveTo(20.7605f, 4.67f, 19.3205f, 3.23f, 15.2505f, 3.23f)
                horizontalLineTo(15.1205f)
                curveTo(11.4105f, 3.23f, 9.9305f, 4.42f, 9.6605f, 7.62f)
                curveTo(9.6105f, 8.03f, 9.2705f, 8.34f, 8.8405f, 8.3f)
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
                moveTo(14.88f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12.0f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(14.88f)
                curveTo(15.29f, 11.25f, 15.63f, 11.59f, 15.63f, 12.0f)
                curveTo(15.63f, 12.41f, 15.3f, 12.75f, 14.88f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6498f, 16.1001f)
                curveTo(12.4598f, 16.1001f, 12.2698f, 16.0301f, 12.1198f, 15.8801f)
                curveTo(11.8298f, 15.5901f, 11.8298f, 15.1101f, 12.1198f, 14.8201f)
                lineTo(14.9398f, 12.0001f)
                lineTo(12.1198f, 9.1801f)
                curveTo(11.8298f, 8.8901f, 11.8298f, 8.4101f, 12.1198f, 8.1201f)
                curveTo(12.4098f, 7.8301f, 12.8898f, 7.8301f, 13.1798f, 8.1201f)
                lineTo(16.5298f, 11.4701f)
                curveTo(16.8198f, 11.7601f, 16.8198f, 12.2401f, 16.5298f, 12.5301f)
                lineTo(13.1798f, 15.8801f)
                curveTo(13.0298f, 16.0301f, 12.8398f, 16.1001f, 12.6498f, 16.1001f)
                close()
            }
        }
        .build()
        return _login!!
    }

private var _login: ImageVector? = null
