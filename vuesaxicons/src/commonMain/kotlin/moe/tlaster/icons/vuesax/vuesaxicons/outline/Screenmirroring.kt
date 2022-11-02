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

public val OutlineGroup.Screenmirroring: ImageVector
    get() {
        if (_screenmirroring != null) {
            return _screenmirroring!!
        }
        _screenmirroring = Builder(name = "Screenmirroring", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4f, 19.25f)
                horizontalLineTo(12.6f)
                curveTo(10.68f, 19.25f, 9.75f, 18.32f, 9.75f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(9.75f, 12.68f, 10.68f, 11.75f, 12.6f, 11.75f)
                horizontalLineTo(16.4f)
                curveTo(18.32f, 11.75f, 19.25f, 12.68f, 19.25f, 14.6f)
                verticalLineTo(16.4f)
                curveTo(19.25f, 18.32f, 18.32f, 19.25f, 16.4f, 19.25f)
                close()
                moveTo(12.6f, 13.25f)
                curveTo(11.52f, 13.25f, 11.25f, 13.52f, 11.25f, 14.6f)
                verticalLineTo(16.4f)
                curveTo(11.25f, 17.48f, 11.52f, 17.75f, 12.6f, 17.75f)
                horizontalLineTo(16.4f)
                curveTo(17.48f, 17.75f, 17.75f, 17.48f, 17.75f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(17.75f, 13.52f, 17.48f, 13.25f, 16.4f, 13.25f)
                horizontalLineTo(12.6f)
                close()
            }
        }
        .build()
        return _screenmirroring!!
    }

private var _screenmirroring: ImageVector? = null
