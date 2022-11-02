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

public val OutlineGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1504f, 22.75f)
                curveTo(4.7404f, 22.75f, 4.4004f, 22.41f, 4.4004f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(4.4004f, 1.59f, 4.7404f, 1.25f, 5.1504f, 1.25f)
                curveTo(5.5604f, 1.25f, 5.9004f, 1.59f, 5.9004f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(5.9004f, 22.41f, 5.5604f, 22.75f, 5.1504f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3504f, 16.75f)
                horizontalLineTo(5.1504f)
                curveTo(4.7404f, 16.75f, 4.4004f, 16.41f, 4.4004f, 16.0f)
                curveTo(4.4004f, 15.59f, 4.7404f, 15.25f, 5.1504f, 15.25f)
                horizontalLineTo(16.3504f)
                curveTo(17.4404f, 15.25f, 17.9504f, 14.96f, 18.0504f, 14.71f)
                curveTo(18.1504f, 14.46f, 18.0004f, 13.9f, 17.2204f, 13.13f)
                lineTo(16.0204f, 11.93f)
                curveTo(15.5304f, 11.5f, 15.2304f, 10.85f, 15.2004f, 10.13f)
                curveTo(15.1704f, 9.37f, 15.4704f, 8.62f, 16.0204f, 8.07f)
                lineTo(17.2204f, 6.87f)
                curveTo(17.9604f, 6.13f, 18.1904f, 5.53f, 18.0804f, 5.27f)
                curveTo(17.9704f, 5.01f, 17.4004f, 4.75f, 16.3504f, 4.75f)
                horizontalLineTo(5.1504f)
                curveTo(4.7304f, 4.75f, 4.4004f, 4.41f, 4.4004f, 4.0f)
                curveTo(4.4004f, 3.59f, 4.7404f, 3.25f, 5.1504f, 3.25f)
                horizontalLineTo(16.3504f)
                curveTo(18.5404f, 3.25f, 19.2404f, 4.16f, 19.4704f, 4.7f)
                curveTo(19.6904f, 5.24f, 19.8404f, 6.38f, 18.2804f, 7.94f)
                lineTo(17.0804f, 9.14f)
                curveTo(16.8304f, 9.39f, 16.6904f, 9.74f, 16.7004f, 10.09f)
                curveTo(16.7104f, 10.39f, 16.8304f, 10.66f, 17.0404f, 10.85f)
                lineTo(18.2804f, 12.08f)
                curveTo(19.8104f, 13.61f, 19.6604f, 14.75f, 19.4404f, 15.3f)
                curveTo(19.2104f, 15.83f, 18.5004f, 16.75f, 16.3504f, 16.75f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
